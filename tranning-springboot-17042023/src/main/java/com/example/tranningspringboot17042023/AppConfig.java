package com.example.tranningspringboot17042023;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	SimpleBean simpleBeanConfigure() {
		// Khởi tạo một instance của SimpleBean và trả ra ngoài
		return new SimpleBean("loda");
	}
}
