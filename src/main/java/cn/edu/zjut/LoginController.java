package cn.edu.zjut;

import cn.edu.zjut.Dao.DaoException;
import cn.edu.zjut.Dao.UserDaoImpl;
import cn.edu.zjut.model.UserBean;
import cn.edu.zjut.Dao.UserDao;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        UserBean user = new UserBean();
        UserDao userDao = new UserDaoImpl();

        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setType(Integer.parseInt(request.getParameter("type")) );

        try
        {
            if(userDao.findUser(user.getUsername(), user.getPassword(), user.getType())){
                request.setAttribute("USER",user);
                request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
            }
            else{
                request.getRequestDispatcher("loginFailed.jsp").forward(request,response);
            }
        }
        catch (DaoException e)
        {
            e.printStackTrace();
        }
    }
}