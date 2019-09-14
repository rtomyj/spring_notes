package com.spring_notes;

import com.spring_notes.model.LifeCycle;
import com.spring_notes.model.Phone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNotesGeneral
{
	private ApplicationContext appContext;

	public SpringNotesGeneral()
	{
		String[] xml_configs = { "beans/general_beans.xml" };

		appContext = new ClassPathXmlApplicationContext(xml_configs);

		LifeCycle lifeCycle = (LifeCycle) appContext.getBean("life_cycle");
	}


	/*
		* Difference between a singleton and prototype bean.
		*
		* Singleton (default) - only one instance per bean. Making 2+ will create 2+
		* objects with same reference.
		*
		* Prototype - each bean is a new reference
	 */
	public void beanScope() {
		Phone singleton1 = (Phone) appContext.getBean("singleton"), singleton2 = (Phone) appContext.getBean("singleton");
		Phone prototype1 = (Phone) appContext.getBean("prototype"), prototype2 = (Phone) appContext.getBean("prototype");

		System.out.println();
		System.out.println(String.format("Testing singleton on init: .equals() = %b", singleton1.equals(singleton2)));

		singleton1.setName("Galaxy Note 10");
		singleton1.setManufacture("Samsung");
		System.out.println(
				String.format("Testing singleton bean after changing props: .equals() = %b", singleton1.equals(singleton2)));

		System.out.println();
		System.out
				.println(String.format("Testing prototype bean after init: .equals() = %b", singleton1.equals(singleton2)));

		prototype1.setName("Galaxy Note 10");
		prototype1.setManufacture("Samsung");
		System.out.println(
				String.format("Testing prototype bean after changing props: .equals() = %b", prototype1.equals(prototype2)));
	}


	/*
		* Bean inheritance - parent bean specifies attributes all child beans will
		* inherit (can be overridden)
	 */
	public void beanInheritance()
	{
		Phone iphone = (Phone) appContext.getBean("iphone");
		System.out.println(iphone.toString());
	}


	public void closeContext()
	{
		((ClassPathXmlApplicationContext) appContext).close();
	}
}