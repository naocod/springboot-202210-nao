package com.study.springboot202210nao.web.dto;

import lombok.Data;

@Data // 데이터를 요청 받을때 getter와 setter를 통해 받아 필요함
public class RequestStudyDto {
    private String name;
    private String email;
    private String address;


}
