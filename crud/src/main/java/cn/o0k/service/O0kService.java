package cn.o0k.service;

import cn.o0k.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class O0kService {
    @Autowired
    private UserMapper userMapper;

    public void mm() {
        userMapper.selectByPrimaryKey(1);

        System.out.println(userMapper);
    }

}
