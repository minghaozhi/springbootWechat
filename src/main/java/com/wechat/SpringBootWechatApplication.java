package com.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 这里，启用定时任务
public class SpringBootWechatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWechatApplication.class, args);
	}
}
