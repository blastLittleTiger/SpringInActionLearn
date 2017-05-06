package com.rjx.model;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:User
// Date:2017/5/6.
// Copyright="(c) renjiaxin.jesse 2017'
// Licence = "prayjourney 2017"
//
//                 ┏ ┓   ┏ ┓
//              ┏━━┛ ┻━━━┛ ┻━━┓
//              ┃    #
//              ┃   ┳┛  ┗*━   ┃    蹉跎错，消磨过，最是光阴化浮沫。
//              ┃      ┻      ┃
//              ┗━━┓       ┏━━┛
//                 ┃         ┗━━━━━━━━━━┓
//                 ┃  神兽保佑           ┣━┓
//                 ┃  永无BUG！         ┏┛
//                 ┗┓━┓ ┏━━━━━━━━━┳━┓━┓┛
//                  ┃━┫━┫         ┃━┫━┫
//                  ┗━┻━┛         ┗━┻━┛
//
// ---------------------------------------------------------------

public class User
{
    /**
     * 主键id,自增长
     */
    private int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户角色
     */
    private int role;

    /**
     * 电子邮件
     */
    private String email = "";

    /**
     * 手机号码
     */
    private String phone = "";

    /**
     * 额外说明
     */
    private String extras = "";

    public User()
    {
        super();
    }

    public User(String username, String password, int role, String email, String phone, String extras)
    {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.extras = extras;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getRole()
    {
        return role;
    }

    public void setRole(int role)
    {
        this.role = role;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getExtras()
    {
        return extras;
    }

    public void setExtras(String extras)
    {
        this.extras = extras;
    }

    @Override
    public String toString()
    {
        return "User [username=" + username + ", password=" + password + ", role=" + role + ", email=" + email + ", phone=" + phone + ", extras=" + extras + "]";
    }


}