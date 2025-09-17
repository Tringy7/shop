package com.shop.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @GetMapping(value = "/admin/order")
    public String showOrder(Model model) {
        return "admin/order/show";
    }
}
