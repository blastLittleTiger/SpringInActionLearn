package rjx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import rjx.config.JavaConfigClass;
import rjx.model.Book;
import rjx.service.BookInfoService;

/**
 * Hello world!
 */
public class JavaRunApp
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigClass.class);

        BookInfoService service = (BookInfoService) context.getBean("bookService");
        Book book = new Book();
        book.setName("万历十五年");
        book.setPrice(28.9);
        service.printbookinfo(book);

        context.close();
    }
}
