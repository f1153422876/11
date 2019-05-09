package cn.itheima.controller;

import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")

    public String  findById(Model model){
        User byId = userService.findById(1);
        model.addAttribute("user" ,byId);
        System.out.println(byId);
        return "List";
    }
}
