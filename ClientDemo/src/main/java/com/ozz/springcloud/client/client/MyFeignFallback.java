package com.ozz.springcloud.client.client;

import org.springframework.stereotype.Component;

@Component
public class MyFeignFallback implements MyFeignClient {
	@Override
	public String hello(String name) {
		return "fallback hello";
	}
}