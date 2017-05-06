package com.rjx.config;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:YellowDuckJDBCConfig
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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/*开启xml时候注视掉此类,这时此类可以忽略*/
/*此为配置类*/
@Configuration
@ComponentScan(basePackages = {"com.rjx"})
public class YellowDuckJDBCConfig
{
    private static final String TAG = "YellowDuckJDBCConfig";

    @Bean(name = "duckDataSource")
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("mysql://localhost:3306/little_duck");
        dataSource.setUsername("root");
        dataSource.setPassword("renjiaxin");
        return dataSource;
    }

    @Bean(name = "duckJdbcTemplate")

    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }

    //    @Bean
    //    public YellowDuckDaoImpl yellowDuckDaoImpl(JdbcTemplate jdbcTemplate)
    //    {
    //        return new YellowDuckDaoImpl(jdbcTemplate);
    //    }


} 