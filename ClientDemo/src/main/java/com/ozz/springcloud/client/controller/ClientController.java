package com.ozz.springcloud.client.controller;

import com.ozz.springcloud.client.client.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

  @Autowired
  private MyFeignClient myFeignClient;

  @GetMapping("/hello/{name}")
  public String myHello(@PathVariable("name") String name) {
    return myFeignClient.hello(name);
  }
}