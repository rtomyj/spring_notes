package com.spring_notes.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Phone
{
	private String name, manufacture;
	private float screenSize;

	public Phone() {}

	public Phone(String name, String manufacture, float screenSize)
	{
		this.name = name;
		this.manufacture = manufacture;
		this.screenSize = screenSize;
	}

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

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)	return true;
		if (obj == null || this.getClass() != obj.getClass())	return false;

		Phone phoneObj = (Phone) obj;
		if (this.name.equals(phoneObj.name) && this.manufacture.equals(phoneObj.manufacture) && this.screenSize == phoneObj.screenSize)	return true;

		return false;
	}

}