package com.example.springbooth2demo.dao;

import com.example.springbooth2demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Auther: CWT
 * @Date: 2020/9/23 14:11
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void addTest(){
        User user = new User();
        user.setType("老师");
        user.setAge(37);
        user.setName("石狮");
        userRepository.save(user);
    }

    @Test
    public void addSome(){
        for (int i = 0; i < 50; i++) {
            User user = new User();
            user.setType("学生");
            user.setAge(18);
            user.setName("学生"+i);
            userRepository.save(user);
        }
    }

    @Test
    public void findTest(){
        userRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void removeTest(){
        userRepository.deleteAll();
    }
}
