package com.study.springboot202210nao.iocAndDi;

public class Main {

    private final UserService userService;

    public Main(UserService userService) { // 매개변수로 받음
        this.userService = userService;
    }

    public void run() {
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void main(String[] args) {
        // 의존성을 주입했다 -> Di
        UserService userService = UserServiceImpl.getInstance();

        Main main = new Main(userService); // Main을 생성할 때 null 넣어도 됨. userServiceImpl 안넣어도 됨
        main.run();
    }
}
