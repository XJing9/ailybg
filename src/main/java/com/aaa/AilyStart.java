package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;

@SpringBootApplication
public class AilyStart{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AilyStart.class, args);
    }

}
