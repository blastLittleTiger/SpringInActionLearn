package rjx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rjx.model.Car;


public class AppXML
{
    /*spring_beans.xml文件应该放在何处呢？是如何扫描到的呢？*/
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_beans.xml");
        Car car = (Car) ctx.getBean("car1");
        System.out.println(car);
        car = (Car) ctx.getBean("car2");
        System.out.println(car);
        car = (Car) ctx.getBean("car3");
        System.out.println(car);
    }

}