package com.itheima.factory;

import com.itheima.dao.UseDao;
import com.itheima.dao.impl.UseDaoImpl;

public class UseDaoFactory {
    public UseDao getUseDao(){
        return new UseDaoImpl();
    }
}
