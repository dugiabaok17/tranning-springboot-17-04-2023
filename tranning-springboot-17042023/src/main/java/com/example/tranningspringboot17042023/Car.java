package com.example.tranningspringboot17042023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	   @Autowired
	   @Qualifier("VNEngine")
	    Engine engine;
	   
	   
}
