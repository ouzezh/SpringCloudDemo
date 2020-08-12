package com.ozz.springcloud.server;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

	public static void main(String[] args) {
//		SpringApplication.run(ServerApp.class, args);
		System.out.print("please input server (1 or 2): ");
		int serverId = new Scanner(System.in).nextInt();
		new SpringApplicationBuilder().sources(ServerApp.class).profiles(String.format("server%s",serverId)).run(args);
	}

}
