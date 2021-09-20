package cn.edu.zjut.model;
public class UserBean{

    //属性声明
    private String username;
    private String password;
    private int type;

    public UserBean() {}
    public UserBean(String username, String password, int type)
    {
        super();
        this.username = username;
        this.password = password;
        this.type = type;
    }

    // get 方法
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    // set方法
    public void setUsername (String username)
    {
        this. username = username ;
    }
    public void setPassword (String password)
    {
        this. password = password;
    }
    public int getType()
    {
        return type;
    }
    public void setType(int type)
    {
        this.type = type;
    }

}
