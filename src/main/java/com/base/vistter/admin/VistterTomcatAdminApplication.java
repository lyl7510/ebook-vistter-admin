package com.base.vistter.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.base.vistter.admin.*")
public class VistterTomcatAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VistterTomcatAdminApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VistterTomcatAdminApplication.class);
    }
}
