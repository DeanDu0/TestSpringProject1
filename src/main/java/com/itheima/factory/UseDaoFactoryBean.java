package com.itheima.factory;

import com.itheima.dao.UseDao;
import com.itheima.dao.impl.UseDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UseDaoFactoryBean implements FactoryBean<UseDao> {
    @Override
    //代替原始实例工厂中创建对象的方法
    public UseDao getObject() throws Exception {
        return new UseDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UseDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
