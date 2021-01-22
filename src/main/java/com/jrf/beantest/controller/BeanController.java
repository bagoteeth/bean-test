package com.jrf.beantest.controller;

import com.jrf.beantest.config.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ruofa
 * @Date 2021/1/22 10:12
 * @Version 1.0
 */
@RestController
@RequestMapping("bean")
public class BeanController {
    @RequestMapping("user")
    public String getUserBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        UserBean obj= (UserBean) context.getBean("userBean");
        return obj.getUserId();
    }
}
