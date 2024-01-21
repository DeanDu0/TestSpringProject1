package com.itheima.dao.impl;

import com.itheima.dao.UseDao;
import org.springframework.stereotype.Repository;

@Repository
public class UseDaoImpl implements UseDao {
    @Override
    public void save() {
        System.out.println("use dao save ....");
    }
}
