package com.spring_notes;

import com.spring_notes.component.ComputerComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNotesAnnotation
{
	private ApplicationContext appContext;


	/*
			Using annotation based beans (Spring 2.5 and above required).
			To configure annotation based beans the xml config file will need to include two props:
				<context:annotation-config />
				<context:component-scan base-package="" />
	*/
	public void annotationCongfigBaseExample()
	{
		appContext = new ClassPathXmlApplicationContext("beans/annotation_beans.xml");

		ComputerComponent computer = (ComputerComponent) appContext.getBean("sample");
		System.out.println(computer.toString());
	}
}
