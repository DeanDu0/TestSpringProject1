package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.dao.UseDao;
import com.itheima.factory.OrderDaoFactory;
import com.itheima.factory.UseDaoFactory;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IoC容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        //获取bean
        BookDao bookDao= (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService= (BookService) ctx.getBean("service");
        bookService.save();
        //BookService bookService=new BookServiceImpl();
        //bookService.save();
        //OrderDao orderDao= OrderDaoFactory.getOrderDao();
        OrderDao orderDao= (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
        //UseDaoFactory useDaoFactory=new UseDaoFactory();
        //UseDao useDao=useDaoFactory.getUseDao();
        //UseDao useDao= (UseDao) ctx.getBean("useDao");
        //useDao.save();
        //ctx.close();
    }
}
