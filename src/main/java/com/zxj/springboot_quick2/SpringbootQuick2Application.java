package com.zxj.springboot_quick2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/*
* Application启动类的位置不对：要将Application类放在最外侧，即包含所有子包 ，spring-boot会自动加载启动类所在包下及其子包下的所有组件*/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootQuick2Application {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootQuick2Application.class);
    }

}
