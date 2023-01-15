package com.example.atguigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.atguigu.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
