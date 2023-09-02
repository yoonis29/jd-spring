package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnotherConfigApp {

    @Bean
    public String str1(){
        return "Welcome to Cydeo App";
    }
    @Primary
    @Bean
    public  String str2(){
        return "Spring Core Practice";
    }
}
