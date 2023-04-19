package com.example.tranningspringboot17042023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TranningSpringboot17042023Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TranningSpringboot17042023Application.class, args);

//		SimpleBean simpleBean = context.getBean(SimpleBean.class);
//        // In ra màn hình
//        System.out.println("Simple Bean Example: " + simpleBean.toString());

		SimpleBean simpleBean1 = context.getBean(SimpleBean.class);
		
		SimpleBean simpleBean2 = context.getBean(SimpleBean.class);

		System.out.println(simpleBean1);
		System.out.println(simpleBean2);

//		Car c = context.getBean(Car.class);
//	     c.engine.run();
	}

}
