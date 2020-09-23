package com.example.springbooth2demo.contraller;

import com.example.springbooth2demo.dao.UserRepository;
import com.example.springbooth2demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: CWT
 * @Date: 2020/9/23 14:08
 * @Description:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/findUserByType")
    public List<User> findUserByType(@RequestParam String type){
        return userRepository.getUserByType(type);
    }

    @ResponseBody
    @RequestMapping("/getUserByType")
    public List<User> getUserByType(@RequestParam String type){
        return userRepository.findByType(type);
    }

}
