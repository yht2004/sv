package com.data2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.data2.project.system.*.mapper")
public class Data2Application {

    public static void main(String[] args) {
        SpringApplication.run(Data2Application.class, args);
    }

}
