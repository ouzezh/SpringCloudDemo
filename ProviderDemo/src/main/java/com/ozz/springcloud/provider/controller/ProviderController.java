package com.ozz.springcloud.provider.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

  @GetMapping("/hello/{name}")
  public String hello(HttpServletRequest request, @PathVariable String name) throws Exception {
    if(name.matches("\\d+")) {
      Thread.sleep(Long.valueOf(name));
    }
    String res = "Hello, " + name + ", This is a greeting from " + request.getRequestURL();
    System.out.println(res);
    return res;
  }

}