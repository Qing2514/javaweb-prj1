package cn.edu.zjut.Dao;

import cn.edu.zjut.model.UserBean;

public interface UserDao extends Dao
{
    public boolean findUser(String username, String password, int type) throws DaoException;
    public boolean registerUser(UserBean user) throws DaoException;
}
