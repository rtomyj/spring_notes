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

		// using bean name (first arg) and class being used (second arg)
		PhonePurchase autowiredSetters = (PhonePurchase) appContext.getBean("phone_purchase", PhonePurchase.class);
		System.out.println(autowiredSetters.toString());
	}
}