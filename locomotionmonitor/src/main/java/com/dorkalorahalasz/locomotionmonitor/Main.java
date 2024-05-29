package com.dorkalorahalasz.locomotionmonitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:application-dev.properties"),
       // @PropertySource("classpath:application-user.properties")
})
public class Main {

    // main page url
    private static String targetUrl;

    public static void main(String[] args) {

        // Set the active profils for now hardcoded, but TODO:
        System.setProperty("spring.profiles.active", "dev");

        // Start SpringBoot
        SpringApplication.run(Main.class, args);
        log.info("Hello world! My target is: " + targetUrl);
    }

    @Value("${targetUrl}")
    public void setTargetUrl(String targetUrl) throws Exception {
        if (targetUrl == null || targetUrl.trim().equals("")) {
            throw new Exception("targetUrl is missing! Please check application-dev.properties");
        }
        Main.targetUrl = targetUrl;
    }
}