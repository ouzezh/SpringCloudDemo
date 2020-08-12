package com.ozz.springcloud.provider;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApp {

	public static void main(String[] args) {
//		SpringApplication.run(ProviderApp.class, args);
		System.out.print("please input provider port: ");
		int serverId = new Scanner(System.in).nextInt();
		new SpringApplicationBuilder().sources(ProviderApp.class).properties(String.format("server.port=%s",serverId)).run(args);
	}

}
