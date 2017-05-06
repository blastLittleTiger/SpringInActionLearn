package com.rjx;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:UserDaoTest
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


import com.rjx.dao.UserDao;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest extends TestCase
{
    private static final String TAG = "UserDaoTest";

    public void testQueryUserByName()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
        UserDao userdao = (UserDao) ctx.getBean("userDao");
        assertEquals("123123", userdao.queryUserByName("AAA").getPassword());
    }
}
