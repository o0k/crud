package cn.o0k.controller;

import cn.o0k.dao.UserMapper;
import cn.o0k.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
//@my
public class O0kController {
    @Autowired
    private DataSource dataSource;

    // @Autowired
    // private UserMapper userMapper;




    @RequestMapping("o0k")
    // @RequestBody
    @Transactional
    // @RequestParam

    public String mm(){

        System.out.println("张澎");

        // User user = userMapper.selectByPrimaryKey(1);
        System.out.println("fffff");
        // System.out.println(user);

        return "zz";
    }
}
