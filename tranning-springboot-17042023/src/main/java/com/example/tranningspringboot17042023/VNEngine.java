package com.example.tranningspringboot17042023;

import org.springframework.stereotype.Component;

@Component
public class VNEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Tôi là động cơ việt nam");
		
	}

}
