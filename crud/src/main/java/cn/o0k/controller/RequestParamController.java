package cn.o0k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

    @RequestMapping("anno/testRequestParam")
    public String testRequestParm(@RequestParam(name="name") String username) { // 获得请求体的一个属性
        System.out.println("testRequestParm");
        System.out.println("前端传过来的 username :" + username);

        return "toBack";
    }
}
