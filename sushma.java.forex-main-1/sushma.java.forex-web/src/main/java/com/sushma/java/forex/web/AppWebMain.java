package com.sushma.java.forex.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EntityScan(basePackages = "com.sushma.java.forex.common.entity")
@EnableJpaRepositories(basePackages = "com.sushma.java.forex.dao")
@ComponentScan(basePackages = {"com.sushma.java.forex.services", "com.sushma.java.forex.web"})
public class AppWebMain 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppWebMain.class, args);
        
    }
}
