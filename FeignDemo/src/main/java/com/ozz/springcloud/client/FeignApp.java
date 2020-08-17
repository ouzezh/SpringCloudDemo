package com.ozz.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 集成Feign(默认集成Ribbon,在配置文件中开启Hystrix)
public class FeignApp {

  public static void main(String[] args) {
    SpringApplication.run(FeignApp.class, args);
  }

}
