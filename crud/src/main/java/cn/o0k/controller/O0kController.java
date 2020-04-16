package cn.o0k.controller;

import cn.o0k.dao.UserMapper;
import cn.o0k.pojo.User;
import cn.o0k.service.O0kService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
public class O0kController {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private O0kService o0kService;




    // @RequestBody
    // @Transactional
    // @RequestParam

    @RequestMapping("o0k")
    public String mm(){

        o0kService.mm();

        System.out.println("张澎");
        System.out.println(dataSource);

        return "zz";
    }
}
