package cn.o0k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("all")
public class AllController {

    @RequestMapping("/pull")
    public String pull() {
        System.out.println("puulllll");
        return "pull";
    }
}
