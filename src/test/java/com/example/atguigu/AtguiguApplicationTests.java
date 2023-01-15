package com.example.atguigu;

import com.example.atguigu.entity.User;
import com.example.atguigu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class AtguiguApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void finaAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void Insert() {
        User user = new User();
//        user.setId(5L);
        user.setAge(39);
        user.setName("Mary1");
        user.setEmail("mary1@gmail.com");
//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());
        userMapper.insert(user);
    }

}
