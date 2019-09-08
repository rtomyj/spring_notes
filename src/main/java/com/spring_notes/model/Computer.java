package com.spring_notes.model;

public class Computer
{
	private String model;
	private int year;

	public Computer() {}

	public Computer(String model, int year)
	{
		this.model = model;
		this.year = year;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public String toString()
	{
		return String.format("Computer %s from %d", this.model, this.year);
	}
}