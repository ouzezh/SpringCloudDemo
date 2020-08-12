package com.ozz.springcloud.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "myProvider", fallback = MyFeignFallback.class)
public interface MyFeignClient {

  @GetMapping(value = "/hello/{name}")
  String hello(@PathVariable("name") String name);

}
