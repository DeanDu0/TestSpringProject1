package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.dao.UseDao;
import com.itheima.factory.OrderDaoFactory;
import com.itheima.factory.UseDaoFactory;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IoC容器
        //ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        //ctx.registerShutdownHook();
        //获取bean
        BookDao bookDao= (BookDao) ctx.getBean(BookDao.class);
        bookDao.save();
        System.out.println(bookDao);
        BookDao bookDaoB= (BookDao) ctx.getBean(BookDao.class);
        System.out.println(bookDaoB);
        BookService bookService= (BookService) ctx.getBean(BookService.class);
        bookService.save();
        //BookService bookService=new BookServiceImpl();
        //bookService.save();
        //OrderDao orderDao= OrderDaoFactory.getOrderDao();
        //OrderDao orderDao= (OrderDao) ctx.getBean("orderDao");
        //orderDao.save();
        //UseDaoFactory useDaoFactory=new UseDaoFactory();
        //UseDao useDao=useDaoFactory.getUseDao();
        //UseDao useDao= (UseDao) ctx.getBean("useDao");
        //useDao.save();
        ctx.close();
    }
}
