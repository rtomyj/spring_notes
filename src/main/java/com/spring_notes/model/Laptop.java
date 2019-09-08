package com.spring_notes.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop
{
	@Autowired
	@Qualifier("macbook_pro")
	Computer computer;

	int batteryCapacity;

	public void setComputer(Computer computer)
	{
		this.computer = computer;
	}

	public void setBatteryCapacity(int batteryCapacity)
	{
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString()
	{
		return computer.toString() + " With battery capacity of " + batteryCapacity;
	}
}