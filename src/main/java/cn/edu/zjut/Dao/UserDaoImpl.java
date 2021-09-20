package cn.edu.zjut.Dao;

import cn.edu.zjut.model.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao
{
    public boolean findUser(String username, String password, int type) throws DaoException{
        String sql = "SELECT * FROM usertable WHERE username = ? AND password = ? AND type = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setInt(3, type);
            try (ResultSet rst = pstmt.executeQuery())
            {
                return rst.next();
            }
        }
        catch (SQLException se)
        {
            return false;
        }
    }

    public boolean registerUser(UserBean user) throws DaoException{
        String sql = "INSERT INTO usertable(username, password, type) VALUES (?,?,?)";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getType());
            pstmt.executeUpdate();
            conn.close();
            return true;
        }
        catch (SQLException se)
        {
            System.out.println(se);
            return false;
        }
    }
}
