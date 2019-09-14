package com.spring_notes;

import com.spring_notes.model.Phone;
import com.spring_notes.model.PhonePurchase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNotesXML
{
	private ApplicationContext appContext;

	public SpringNotesXML()
	{
		String[] xml_configs = { "beans/xml_beans.xml" };

		appContext = new ClassPathXmlApplicationContext(xml_configs);
	}

	public void xmlConfigBaseExample()
	{
		Phone phone = (Phone) appContext.getBean("iphone_xs");
		System.out.println(phone.toString());

		phone = appContext.getBean("iphone_11", Phone.class);
		System.out.println(phone.toString());

		phone = appContext.getBean("galaxy_s10", Phone.class);
		System.out.println(phone.toString());

		phone = appContext.getBean("pixel", Phone.class);
		System.out.println(phone.toString());


	}
}