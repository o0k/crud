package cn.o0k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ToBackController {

    @RequestMapping("/helloworld2")
    public String hello(HttpServletRequest request, String userName, @RequestParam("pass") String passWord){
        userName=request.getParameter("userName");
        passWord=request.getParameter("pass");

        if(userName.equals("linyi") && passWord.equals("123456")){

            return "success";
        }else{
            System.out.println("hello world");
            return "error";
        }

    }
}
