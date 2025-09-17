package com.shop.shop.controller.admin;

import com.shop.shop.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping(value = "/admin/product")
    public String showProduct(Model model) {
        return "admin/product/show";
    }

    @GetMapping(value = "/admin/product/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "admin/product/create";
    }
}
