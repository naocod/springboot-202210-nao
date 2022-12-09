package com.study.springboot202210nao.web.controller;

import com.study.springboot202210nao.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductTestController {
    @GetMapping("/product/addition")
    public String loadAddition() {
        return "product/product_add";
    }

//    @PostMapping("/api/product")
//
//    public String registerProduct(HttpServletRequest request) {
//        System.out.println(request.getParameter("price"));
//
//        return "product/product_view";
//    }

//    @PostMapping("/api/product")
//    public String registerProduct(@RequestParam String productCode,
//                                  @RequestParam String productName,
//                                  @RequestParam("price") int p,
//                                  @RequestParam int stock) {
//        System.out.println(productName); // 변수명이랑 파라미터 값이 같으면 줄여도됨
//        System.out.println(p);
//        return "product/product_view";
//    }

    @PostMapping("/api/product")
    public String registerProduct(Model model, ProductDto productDto) {
        model.addAttribute("productCode", productDto);
        System.out.println(productDto);
        return "product/product_view";
    }
    @GetMapping("/product/addition2")
    public String loadAddition2() {
        return "product/product_add2";
    }
    @ResponseBody
    @PostMapping("/api/product/2")
    public String registerProduct(ProductDto productDto) {
        System.out.println(productDto);
        return productDto.toString();
    }
}
