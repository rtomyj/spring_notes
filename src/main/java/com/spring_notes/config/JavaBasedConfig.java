package com.spring_notes.config;

import com.spring_notes.model.Computer;
import com.spring_notes.model.Laptop;
import com.spring_notes.model.Phone;
import com.spring_notes.model.PhonePurchase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaBasedConfig
{

	@Bean("macbook_pro")
	@Scope("prototype")
	public Computer getMacBookPro()
	{
		return new Computer("MacBook Pro", 2014);
	}

	@Bean("mac_mini")
	public Computer getMacMini()
	{
		return new Computer("Mac Mini", 2014);
	}

	@Bean("laptop")
	public Laptop getLaptop()
	{
		Laptop laptop = new Laptop();
		laptop.setBatteryCapacity(8000);

		return laptop;
	}

}