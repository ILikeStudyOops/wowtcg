package org.csq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csq.mapper")
public class CardManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardManageApplication.class,args);
    }
}
