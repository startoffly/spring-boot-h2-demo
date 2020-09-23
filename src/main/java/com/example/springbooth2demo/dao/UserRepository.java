package com.example.springbooth2demo.dao;

import com.example.springbooth2demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @Auther: CWT
 * @Date: 2020/9/23 12:02
 * @Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //根据type查询所有user
    List<User> getUserByType(String type);
    //同上
    List<User> findByType(String type);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    void deleteAll();
}
