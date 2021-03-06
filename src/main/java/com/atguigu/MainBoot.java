package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainBoot {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainBoot.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        boolean user = run.containsBean("user");
        System.out.println("容器中Tom组件："+user);//false
        System.out.println("容器中Tom组件test："+user);//false
        System.out.println("容器中Tom组件："+user);//false
        boolean pet = run.containsBean("pet");
        System.out.println("容器中user01组件："+pet);//true
        System.out.println("hot-hix分支");
        System.out.println("master冲突测试======");
        System.out.println("测试冲突提交hot-hix======");
        System.out.println("github push 推送");
        System.out.println("github pull 拉取");

    }
}
