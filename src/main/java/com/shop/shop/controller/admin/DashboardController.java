package com.shop.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping(value = "/admin")
    public String showDashboard() {
        return "admin/dashboard/show";
    }
}
