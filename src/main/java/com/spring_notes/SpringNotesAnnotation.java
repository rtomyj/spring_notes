package com.spring_notes;

import com.spring_notes.component.ComputerComponent;
import com.spring_notes.model.PhonePurchase;

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
	public void annotationConfigBaseExample()
	{
		appContext = new ClassPathXmlApplicationContext("beans/annotation_beans.xml");


		// using bean name (first arg) and class being used (second arg)
		PhonePurchase autowiredSetters = appContext.getBean("phone_purchase", PhonePurchase.class);
		System.out.println(autowiredSetters.toString());

		ComputerComponent computer = (ComputerComponent) appContext.getBean("sample");
		System.out.println(computer.toString());
	}
}
