package com.spring_notes;

import com.spring_notes.model.Phone;
import com.spring_notes.model.PhonePurchase;
import com.spring_notes.model.PhoneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNotesXML
{
	private ApplicationContext appContext;
	private Phone phone;
	private PhoneCollections phones;
	private PhonePurchase phonePurchase;


	public SpringNotesXML()
	{
		String[] xml_configs = { "beans/xml_beans.xml" };

		appContext = new ClassPathXmlApplicationContext(xml_configs);
	}

	public void xmlConfigBaseExample()
	{
		phone = (Phone) appContext.getBean("iphone_xs");
		System.out.println(phone.toString());

		phone = appContext.getBean("iphone_11", Phone.class);
		System.out.println(phone.toString());

		phone = appContext.getBean("galaxy_s10", Phone.class);
		System.out.println(phone.toString());

		phone = appContext.getBean("pixel", Phone.class);
		System.out.println(phone.toString());

		phonePurchase = appContext.getBean("purchase1", PhonePurchase.class);
		System.out.println(phonePurchase.toString());

		phonePurchase = appContext.getBean("purchase2", PhonePurchase.class);
		System.out.println(phonePurchase.toString());

		phonePurchase = appContext.getBean("purchase3", PhonePurchase.class);
		System.out.println(phonePurchase.toString());

		phonePurchase = appContext.getBean("purchase4", PhonePurchase.class);
		System.out.println(phonePurchase.toString());

		phones = appContext.getBean("phones", PhoneCollections.class);
		System.out.println(phones.toString());
	}
}