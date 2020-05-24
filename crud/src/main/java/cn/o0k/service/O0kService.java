package cn.o0k.service;

import cn.o0k.mapper.UserMapper;
import cn.o0k.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class O0kService {
    @Autowired
    private UserMapper userMapper;

    public User mm() {
        User user = userMapper.selectByPrimaryKey(1);

        System.out.println(user);

        System.out.println(userMapper);

        return user;
    }
}
