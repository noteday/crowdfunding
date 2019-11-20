package com.zdomin.crowdfunding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
@MapperScan("com.zdomin.crowdfunding.mapper")
public class CrowdfundingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrowdfundingApplication.class, args);
    }

}
