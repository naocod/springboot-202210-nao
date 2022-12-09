package com.study.springboot202210nao.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private String productCode;
    private String productName;
    private String price;
    private String stock;

//    @PostMapping("/api/product")
//    public String registerProduct(@RequestParam String productCode,
//                                  @RequestParam String productName,
//                                  @RequestParam("price") int p,
//                                  @RequestParam int stock) {
//        System.out.println(productName); // 변수명이랑 파라미터 값이 같으면 줄여도됨
//        System.out.println(p);
//        return "product/product_view";
//    }
//    @PostMapping("/api/product")
//    public String registerProduct(ProductDto productDto) {
//        System.out.println(productDto);
//        return "product/product_view";
//    }
}
