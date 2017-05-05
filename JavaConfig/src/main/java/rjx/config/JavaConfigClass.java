package rjx.config;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:JavaConfigClass
// Date:2017/5/4.
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
import org.springframework.context.annotation.Configuration;
import rjx.dao.BookDao;
import rjx.dao.BookDaoImpl;
import rjx.service.BookInfoService;
import rjx.service.BookInfoServiceImpl;
import rjx.service.DataService;
import rjx.service.DataServiceImpl;

@Configuration /*这是java配置的专用的注解，此类为配置类*/

public class JavaConfigClass
{
    /*使用Java装配目前的感觉就是创建一个java配置类
    * 然后在这个类之中进行bean等的装配，此处就变成了完全的配置bean的地点*/
    private static final String TAG = "JavaConfigClass";

    @Bean(name = "bookService")
    public BookInfoService bookInfoService()
    {
        return new BookInfoServiceImpl();
    }

    @Bean
    public DataService dataService()
    {
        return new DataServiceImpl();
    }

    @Bean
    public BookDao bookDao()
    {
        return new BookDaoImpl();
    }

}
