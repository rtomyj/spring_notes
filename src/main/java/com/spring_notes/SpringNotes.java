package com.spring_notes;

import com.spring_notes.component.ComputerComponent;
import com.spring_notes.model.LifeCycle;
import com.spring_notes.model.Phone;
import com.spring_notes.model.PhonePurchase;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringNotes {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		String[] xml_configs = {
				"beans/xml_beans.xml"
		};

		appContext = new ClassPathXmlApplicationContext(xml_configs);

		Phone phone = (Phone) appContext.getBean("iphone_xs");
		System.out.println(phone.toString());

		PhonePurchase autowiredSetters = (PhonePurchase) appContext.getBean("phone_purchase");
		System.out.println(autowiredSetters.toString());


		LifeCycle lifeCycle = (LifeCycle) appContext.getBean("life_cycle");


		/*
			Difference between a singleton and prototype bean.

			Singleton (default) - only one instance per bean.
			Making 2+ will create 2+ objects with same reference.

			Prototype - each bean is a new reference
		*/
		Phone singleton1 = (Phone) appContext.getBean("singleton"), singleton2 = (Phone) appContext.getBean("singleton");
		Phone prototype1 = (Phone) appContext.getBean("prototype"), prototype2 = (Phone) appContext.getBean("prototype");

		System.out.println();
		System.out.println(String.format("Testing singleton on init: .equals() = %b", singleton1.equals(singleton2)));

		singleton1.setName("Galaxy Note 10");
		singleton1.setManufacture("Samsung");
		System.out.println(String.format("Testing singleton bean after changing props: .equals() = %b"
			, singleton1.equals(singleton2)));

		System.out.println();
		System.out.println(String.format("Testing prototype bean after init: .equals() = %b"
			, singleton1.equals(singleton2)));

		prototype1.setName("Galaxy Note 10");
		prototype1.setManufacture("Samsung");
		System.out.println(String.format("Testing prototype bean after changing props: .equals() = %b"
			, prototype1.equals(prototype2)));


		/*
			Bean inheritance - parent bean specifies attributes all child beans will inherit (can be overridden)
		*/
		System.out.println();
		Phone iphone = (Phone) appContext.getBean("iphone");
		System.out.println(iphone.toString());

		((ClassPathXmlApplicationContext) appContext).close();	// removes context with bean info for xml created beans


		/*
			Using annotation based beans.
			To configure annotation based beans the xml config file will need to include two props:
				<context:annotation-config />
				<context:component-scan base-package="" />

			Notice that beans are not configured in the xml file. The component-scan prop will specify the package containing the bean class definitions
		*/
		appContext = new ClassPathXmlApplicationContext("beans/annotation_beans.xml");

		ComputerComponent computer = (ComputerComponent) appContext.getBean("sample");
		System.out.println(computer.toString());



	}
}
