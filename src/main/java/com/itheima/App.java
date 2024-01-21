package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.dao.UseDao;
import com.itheima.factory.OrderDaoFactory;
import com.itheima.factory.UseDaoFactory;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IoC容器，1.加载类路径下的配置文件；2.使用文件系统下的配置文件
        //ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\Dean Du\\IdeaProjects\\TestSpringProject1\\src\\main\\resources\\applicationContext.xml");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        //ctx.registerShutdownHook();
        //获取bean
        BookDao bookDao= (BookDao) ctx.getBean(BookDao.class);
        System.out.println(bookDao);
        bookDao.save();
        BookService bookService= (BookService) ctx.getBean(BookService.class);
        bookService.save();
        //BookService bookService=new BookServiceImpl();
        //bookService.save();
        //OrderDao orderDao= OrderDaoFactory.getOrderDao();
        OrderDao orderDao= (OrderDao) ctx.getBean(OrderDao.class);
        orderDao.save();
        //UseDaoFactory useDaoFactory=new UseDaoFactory();
        //UseDao useDao=useDaoFactory.getUseDao();
        //UseDao useDao= (UseDao) ctx.getBean("useDao");
        //useDao.save();
        //ctx.close();
        DruidDataSource druidDataSource= (DruidDataSource) ctx.getBean(DruidDataSource.class);
        System.out.println(druidDataSource);
        ComboPooledDataSource comboPooledDataSource= (ComboPooledDataSource) ctx.getBean(ComboPooledDataSource.class);
        System.out.println(comboPooledDataSource);
        ctx.close();

    }
}
