package com.study.springboot202210nao.web.controller;

import com.study.springboot202210nao.iocAndDi.Student;
import com.study.springboot202210nao.iocAndDi.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @ResponseBody
    @GetMapping("/student")
    public System printStudent() {
        Student student = Student.builder()
                .studentId(2001)
                .studentName("김경민")
                .build();
        StudentService studentService;
        StudentService.printStudentInfo(student);

        return null;
    }
}
