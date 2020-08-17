package com.ozz.springcloud.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "testService", url = "http://localhost:9000")
public interface MyFeignClient {

  @GetMapping(value = "/hello/{name}")
  String hello(@PathVariable("name") String name);

}
