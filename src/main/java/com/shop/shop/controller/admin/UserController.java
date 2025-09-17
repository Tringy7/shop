package com.shop.shop.controller.admin;

import com.shop.shop.domain.User;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // show user
    @GetMapping(value = "/admin/user")
    public String showUser(Model model) {
        return "admin/user/show";
    }

    // create user
    @GetMapping(value = "/admin/user/create")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "admin/user/create";
    }


}
