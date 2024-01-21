package com.itheima.dao.impl;

import com.itheima.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    public void save(){
        System.out.println("order dao save.......");
    }
}
