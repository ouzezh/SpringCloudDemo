package com.ozz.springcloud.provider.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

  @GetMapping("/hello/{name}")
  public String hello(HttpServletRequest request, @PathVariable String name) {
    return "Hello, " + name + ", This is a greeting from " + request.getRequestURL();
  }

}