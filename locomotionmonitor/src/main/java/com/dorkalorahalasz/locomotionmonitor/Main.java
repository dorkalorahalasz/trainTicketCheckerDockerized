package com.dorkalorahalasz.locomotionmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Start SpringBoot
        SpringApplication.run(Main.class, args);
        log.info("Hello world!");
    }
}