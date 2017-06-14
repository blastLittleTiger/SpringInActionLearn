package com.rjx.dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:YellowDuckDaoImpl
// Date:2017/5/5.
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

import com.rjx.model.YellowDuck;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*XML时无需Repository后的yellowDuckDao*/
@Repository("yellowDuckDao")
public class YellowDuckDaoImpl implements YellowDuckDao
{
    private static final String TAG = "YellowDuckDaoImpl";

    public YellowDuckDaoImpl()
    {
    }

    public YellowDuckDaoImpl(JdbcTemplate jdbcTemplate)
    {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }


    //不太明白下面这句
    /*XML时候需要启用如下代码*/
    private JdbcTemplate jdbcTemplate;

    //将数据源装填，就可以了。
    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }


    /*自动装配或者JavaConfig装配时候使用*/
    /*private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    //将数据源装填，才能成功
    @Autowired
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    */


    public void insert(YellowDuck yellowDuck)
    {
        this.jdbcTemplate.update(sql_insert, yellowDuck.getName(), yellowDuck.getPrice(), yellowDuck.getBirthday());
    }

    public void delete(int yellowDuckId) throws Exception
    {
        this.jdbcTemplate.update(sql_delete, yellowDuckId);
    }

    public void update(YellowDuck yellowDuck)
    {
        this.jdbcTemplate.update(sql_update, yellowDuck.getName(), yellowDuck.getPrice(), yellowDuck.getBirthday(),
                yellowDuck.getId());
    }

    public YellowDuck queryYellowDuck(int yellowDuckId)
    {
        return this.jdbcTemplate.queryForObject(sql_query, new YellowDuckRowMapper(), yellowDuckId);
    }

    public List<YellowDuck> queryAllYellowDucks()
    {
        return this.jdbcTemplate.query(sql_queryAll, new YellowDuckRowMapper());
    }

    private static final class YellowDuckRowMapper implements RowMapper<YellowDuck>
    {
        public YellowDuck mapRow(ResultSet rs, int rowNum) throws SQLException
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double price = rs.getDouble("password");
            //LocalDate birthday = (LocalDate) rs.getDate("birthday");//此处如何转换
            //return new YellowDuck(id, name, price, birthday);
            return null;
        }
    }

    /*增*/
    private final String sql_insert = "insert into yellowduck(name,price,birthday) " + "values(?,?,?)";
    /*删*/
    private final String sql_delete = "delete from yellowduck where id=?";
    /*改*/
    private final String sql_update = "update yellowduck set name= ? , price= ? , birthday= ? where id= ?";
    /*查*/
    private final String sql_query = "select * from yellowduck where id=?";
    /*查全*/
    private final String sql_queryAll = "select * from  yellowduck";
}