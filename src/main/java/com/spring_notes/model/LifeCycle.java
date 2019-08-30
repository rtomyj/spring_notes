package com.spring_notes.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycle
{
	@PostConstruct
	public void onInit()
	{
		System.out.println("Method called right after object is constructed");
	}


	@PreDestroy
	public void onDestroy()
	{
		System.out.println("Method called right before object is cleaned up");
	}
}