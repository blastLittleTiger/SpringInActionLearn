package com.rjx.dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:UserDaoImpl
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

import com.rjx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class UserDaoImpl implements UserDao
{
    private static final String TAG = "UserDaoImpl";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User queryUserByName(String username)
    {
        String sql = "select * from user where username = ? ";
        Object[] params = new Object[]{username};
        final User user = new User();
        jdbcTemplate.query(sql, params, new RowCallbackHandler()
        {
            public void processRow(ResultSet rs) throws SQLException
            {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getInt("role"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setExtras(rs.getString("extras"));

            }

        });

        return user;
    }
}