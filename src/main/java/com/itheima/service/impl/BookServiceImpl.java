package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UseDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //private BookDao bookDao=new BookDaoImpl();
    private BookDao bookDao;
    private UseDao useDao;
//    public BookServiceImpl(BookDao bookDao,UseDao useDao){
//        this.bookDao=bookDao;
//        this.useDao=useDao;
//    }
    public void save(){
        System.out.println("book service save...");
        bookDao.save();
        useDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("set 要在init之前完成");
    }

    public void setUseDao(UseDao useDao) {
        this.useDao = useDao;
    }

    //afterPropertiesSet 在set属性方法之后执行
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init....");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy....");

    }
}
