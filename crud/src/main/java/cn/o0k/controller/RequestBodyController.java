package cn.o0k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestBodyController {

    // @RequestMapping("anno/testRequestBody")
    // public String testRequestBody (@RequestBody String body) {  // 获得请求体的全部内容
    //     System.out.println("testRequestBody");
    //     System.out.println(body);
    //
    //     return "success";
    // }
    @RequestMapping("anno/testRequestBody")
    public String testRequestBody () {  // 获得请求体的全部内容
        System.out.println("testRequestBody");
        System.out.println("body");

        return "toBack";
    }
    @RequestMapping("anno/testRequestParam2")
    public String testRequestParm(@RequestParam(name="username") String username) { // 获得请求体的一个属性
        System.out.println("testRequestParm");
        System.out.println("前端传过来的 username :" + username);



        return "toBack";
    }

    // @RequestMapping("anno/testRequestParam")
    // public String testRequestParm(@RequestParam(name="name") String username) { // 获得请求体的一个属性
    //     System.out.println("testRequestParm");
    //     System.out.println("前端传过来的 username :" + username);
    //
    //     return "toBack";
    // }
}
