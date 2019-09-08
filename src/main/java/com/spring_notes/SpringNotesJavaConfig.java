package com.spring_notes;

import com.spring_notes.config.JavaBasedConfig;
import com.spring_notes.model.Computer;
import com.spring_notes.model.Laptop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringNotesJavaConfig
{
	public void javaConfigBaseExample()
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();

		appContext.register(JavaBasedConfig.class);	// allows for multiple config classes to be specified
		appContext.refresh();

		Computer macBookPro1 = (Computer) appContext.getBean("macbook_pro");
		Computer macBookPro2 = (Computer) appContext.getBean("macbook_pro");
		Computer macMini1 = (Computer) appContext.getBean("mac_mini");
		Computer macMini2 = (Computer) appContext.getBean("mac_mini");

		System.out.println("Creating 4 computer bean objects: MacBook Pro beans are of scope prototype, MacMini are singleton");
		System.out.println("MacBook Pro 1 = " + macBookPro1.toString());
		System.out.println("MacBook Pro 2 = " + macBookPro2.toString());
		System.out.println("Mac Mini 1 = " + macMini1.toString());
		System.out.println("Mac Mini 2 = " + macMini2.toString());

		System.out.println("\nChanging year of MacBook Pro 1 (prototype) and Mac Mini 1 (singleton)");
		macBookPro1.setYear(2019);
		macMini1.setYear(2019);
		System.out.println("MacBook Pro 1 = " + macBookPro1.toString());
		System.out.println("MacBook Pro 2 = " + macBookPro2.toString());
		System.out.println("Mac Mini 1 = " + macMini1.toString());
		System.out.println("Mac Mini 2 = " + macMini2.toString());

		System.out.println("\nUsing autowiring to create a laptop instance");
		Laptop laptop = (Laptop) appContext.getBean("laptop");
		System.out.println(laptop.toString());
	}
}