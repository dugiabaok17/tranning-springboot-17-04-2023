package com.example.tranningspringboot17042023;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class ChinaEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Hello tôi là china engine");
	}

}
