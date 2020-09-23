package com.example.springbooth2demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Auther: CWT
 * @Date: 2020/9/23 10:26
 * @Description:
 */
//@Entity注解加在实体类上，定义对象将会成为被JPA管理的实体，将映射到指定的数据库。@Table注解用来说明该实体类对应的表和数据库，其中name =“xxx"，用来表示数据表的名字，catalog = “xxx"是数据库的名字
@Entity
@Data
//使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@AllArgsConstructor
//使用后添加一个无参构造函数
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String name;
    private Integer age;

    public User(String type, String name, Integer age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }
}
