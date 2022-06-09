package com.hust;

import com.hust.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb01QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Sb01QuickstartApplication.class, args);//此代码获取spring容器
        BookController bean = ctx.getBean(BookController.class);//按类型获取
        System.out.println(bean);
    }

}
