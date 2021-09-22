package cn.o0k.controller;

import cn.o0k.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    //    @RequestMapping("/add")
    //    public User mm() {
    //        System.out.println("★★★★★");
    //        return new User();
    //    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        request.setAttribute("userId",12);
        return "userAdd";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    private String list(Model model) {

        User user = null;
        model.addAttribute("user", user);
        // list.jsp + model = ModelAndView
        return "list";// WEB-INF/jsp/"list".jsp
    }
}
