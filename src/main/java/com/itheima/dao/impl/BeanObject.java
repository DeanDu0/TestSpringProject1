package com.itheima.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 获取第三方数据源对象并进行bean管理
 */
public class BeanObject {
    @Value("${jdbc.driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.name}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Bean
    public DruidDataSource getDatasourceBean(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public ComboPooledDataSource getPooledDataSourceBean() throws Exception{
        ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(username);
        comboPooledDataSource.setPassword(password);
        return comboPooledDataSource;

    }
}
