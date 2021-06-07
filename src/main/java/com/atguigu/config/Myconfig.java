package com.atguigu.config;

import com.atguigu.mode.Pet;
import com.atguigu.mode.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

    @Bean
    public User user(){
        return new User();
    }

    @ConditionalOnBean(name="user") //如果有bean实例user，则注入bean"pet"
    @Bean
    public Pet pet(){
        return new Pet();
    }
}
