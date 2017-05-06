package com.rjx;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:Test
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

import com.rjx.config.YellowDuckJDBCConfig;
import com.rjx.dao.YellowDuckDao;
import com.rjx.model.YellowDuck;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test extends TestCase
{
    private static final String TAG = "Test";


    public void testInsert(YellowDuck yellowDuck)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(YellowDuckJDBCConfig.class);
        YellowDuckDao yellowDuckDao = (YellowDuckDao) ctx.getBean("yellowDuckDao");
        assertEquals("jar", yellowDuckDao.queryYellowDuck(9).getName());
    }
}