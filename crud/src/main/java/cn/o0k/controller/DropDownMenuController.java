package cn.o0k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("anno")
public class DropDownMenuController {

    @RequestMapping("/dropDownMenu")
    public String dropDownMenu() {
        System.out.println("下拉菜单学习..");

        return "dropDownMenu";
    }
}
