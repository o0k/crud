package cn.o0k.controller;

import cn.o0k.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {

    @RequestMapping("user/login")
    // @ResponseBody
    public String mmm(Model model) {
        User user = new User();
        user.setUsername("张澎");
        model.addAttribute("user",user);
        return "success";
    }
}
