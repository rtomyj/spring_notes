package com.spring_notes;

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

		Phone phone = (Phone) appContext.getBean("xml_config_phone");
		System.out.println(phone.toString());

		PhonePurchase autowiredSetters = (PhonePurchase) appContext.getBean("phone_purchase");
		System.out.println(autowiredSetters.toString());

		LifeCycle lifeCycle = (LifeCycle) appContext.getBean("life_cycle");

		((ClassPathXmlApplicationContext) appContext).close();	// removes context with bean info for xml created beans
	}
}
