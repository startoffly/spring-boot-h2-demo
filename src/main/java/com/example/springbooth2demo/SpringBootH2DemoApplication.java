package com.example.springbooth2demo;

import com.example.springbooth2demo.dao.UserRepository;
import com.example.springbooth2demo.entity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootH2DemoApplication {

    //打包时
//    @Bean
    InitializingBean saveData(UserRepository userRepository){
        return ()->{
            //初始化些测试数据
            userRepository.save(new User("老师","石狮",37));
            for (int i = 0; i < 50; i++) {
                User user = new User();
                user.setType("学生");
                user.setName("学生"+i);
                user.setAge(18);
                userRepository.save(user);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2DemoApplication.class, args);
    }

}
