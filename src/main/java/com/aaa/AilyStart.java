package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;

@SpringBootApplication
public class AilyStart extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws Exception {
        System.setProperty("org.apache.tomcat.util.buf.UDecoder.ALLOW_ENCODED_SLASH", "true");
        SpringApplication.run(AilyStart.class, args);
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setUrlDecode(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }

}
