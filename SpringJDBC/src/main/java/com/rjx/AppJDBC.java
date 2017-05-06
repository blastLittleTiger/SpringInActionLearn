package com.rjx;

import com.rjx.dao.YellowDuckDao;
import com.rjx.model.YellowDuck;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class AppJDBC
{
    public static void main(String[] args)
    {
        //TODO:暂时未解决通过JavaConfig配置出现的问题
        //ApplicationContext context = new AnnotationConfigApplicationContext(YellowDuckJDBCConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
        YellowDuckDao dao = (YellowDuckDao) context.getBean("yellowDuckDao");
        //Java配置时候，Could not get JDBC Connection说明在JavaConfig类之中的datasource有问题。
        YellowDuck duck1 = new YellowDuck(110, "12350", 664.89, "2008-02-15");
        dao.insert(duck1);
        //        YellowDuck duck2 = dao.queryYellowDuck(12);
        //        System.out.println(duck2.toString());
        //        List<YellowDuck> ducks = dao.queryAllYellowDucks();
        //        for (YellowDuck temp_duck : ducks)
        //        {
        //            System.out.println(temp_duck.toString());
        //        }

    }
}
