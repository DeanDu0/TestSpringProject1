package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl(){
        System.out.println("验证bean创建对象使用了构造方法");
    }

    private int connectionNum;
    private String databaseName;
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }
    //    public void setConnectionNum(int connectionNum) {
//        this.connectionNum = connectionNum;
//    }
//
//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }

    public void init(){
        System.out.println("bookDao bean 初始化执行"+connectionNum+";"+databaseName);

    }
    public void destroy(){
        System.out.println("bookDao bean 销毁执行");

    }
    public void save(){
        System.out.println("book dao save...");
        System.out.println("遍历数组："+ Arrays.toString(array));
        System.out.println("遍历list"+list);
        System.out.println("遍历set："+set);
        System.out.println("遍历Map："+map);
        System.out.println("遍历Properties："+properties);



    }



}
