package rjx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import rjx.config.AppConfiguration;
import rjx.model.People;
import rjx.service.PeopleService;

public class AutoRunApp
{
    public static void main(String args[])
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        PeopleService service = (PeopleService) context.getBean("peopleService");


        People people001 = new People();
        people001.setName("Mao Zedong");
        service.registerEmployee(people001);

        context.close();
    }
}
