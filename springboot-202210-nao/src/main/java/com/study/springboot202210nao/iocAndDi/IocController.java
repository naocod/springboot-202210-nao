package com.study.springboot202210nao.iocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {

    @Autowired
    @Qualifier("usi3")
    private UserService userService;
    @ResponseBody
    @Qualifier("/ioc")
    public String iocTest() {
        UserService userService;
        UserService createUser;
        UserService getUser;
        UserService updateUser;
        UserService deleteUser;
        return null;
    }
}
