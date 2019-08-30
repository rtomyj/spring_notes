package com.spring_notes.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Phone
{
	private String name, manufacture;
	private float screenSize;

	/*
		Getters
	*/

	public String getName()
	{
		return this.name;
	}

	public String getManufacture()
	{
		return this.manufacture;
	}

	public float getScreenSize()
	{
		return this.screenSize;
	}


	/*
		Setters
	*/

	@Autowired
	public void setName(@Value("iPhone XS Max") String name)
	{
		this.name = name;
	}

	@Autowired
	public void setManufacture(@Value("Apple Inc.") String manufacture)
	{
		this.manufacture = manufacture;
	}

	@Autowired
	public void setScreenSize(@Value("6.5") float screenSize)
	{
		this.screenSize = screenSize;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s %f", name, manufacture, screenSize);
	}

}