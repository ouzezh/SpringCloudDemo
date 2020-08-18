package com.ozz.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignApp {

  public static void main(String[] args) {
    SpringApplication.run(FeignApp.class, args);
  }

}
