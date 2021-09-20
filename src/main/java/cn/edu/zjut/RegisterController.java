package cn.edu.zjut;

import cn.edu.zjut.Dao.DaoException;
import cn.edu.zjut.Dao.UserDao;
import cn.edu.zjut.Dao.UserDaoImpl;
import cn.edu.zjut.model.UserBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterController", value = "/RegisterController")
public class RegisterController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        UserBean user = new UserBean();
        UserDao userDao = new UserDaoImpl();
        String message = null;

        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setType(Integer.parseInt(request.getParameter("type")) );

        try
        {
            if(userDao.registerUser(user)) message = "注册成功！";
            else message = "注册失败，用户名已存在！";
        }
        catch (DaoException e)
        {
            e.printStackTrace();
        }
        request.setAttribute("message",message);
        request.setAttribute("USER",user);
        request.getRequestDispatcher("register.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
