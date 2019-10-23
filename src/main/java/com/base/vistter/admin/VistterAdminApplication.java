package com.base.vistter.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.base.vistter.admin.*")
public class VistterAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(VistterAdminApplication.class, args);
    }

}
