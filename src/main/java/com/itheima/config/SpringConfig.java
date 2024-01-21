package com.itheima.config;

import com.itheima.dao.impl.BeanObject;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.itheima"})
@PropertySource({"jdbc.properties"})
@Import({BeanObject.class})
public class SpringConfig {

}
