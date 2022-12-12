package com.study.springboot202210nao.web.controller;

import com.study.springboot202210nao.web.dto.RequestStudyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Objects;

@Controller
public class ControllerStudy {
    @GetMapping("/study/page")
    public String 페이지응답() {
        return "page_study";
    }
    @ResponseBody
    @GetMapping("/study/text/1")
    public String 문자열데이터응답() {
        return "문자열을 응답";
    }
    @GetMapping("/study/text/2")
    public String 요청데이터Params(String data1, int data2) {
        return "문자열: " + data1 + ", 숫자: " + data2;
    }

    @ResponseBody
    @GetMapping("/study/text/3")
    public String 요청데이터Obj(RequestStudyDto requestStudyDto) {
        return requestStudyDto.toString();
    }

    @ResponseBody
    @PostMapping("/study/student/1")
    public String getJasonAjex(@RequestBody RequestStudyDto requestStudyDto) {
        return requestStudyDto.toString();
    }

//    @ResponseBody
//    @GetMapping("/study/student/1")
//    public Object getJasonAjex2() {
//        RequestStudyDto requestStudyDto = new RequestStudyDto();
//        requestStudyDto.setName("nao");
//        requestStudyDto.setEmail("email@naver.com");
//        requestStudyDto.setAddress("부산광역시 부산진구");
//        return requestStudyDto;
//    }

    @ResponseBody
    @GetMapping("/study/student/1")
    public ResponseEntity<?> getJasonAjex2() {
        RequestStudyDto requestStudyDto = new RequestStudyDto();
        requestStudyDto.setName("nao");
        requestStudyDto.setEmail("email@naver.com");
        requestStudyDto.setAddress("부산광역시 부산진구");
        return new ResponseEntity<>(requestStudyDto, HttpStatus.OK);
    }

}
