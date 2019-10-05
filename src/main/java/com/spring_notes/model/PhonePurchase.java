package com.spring_notes.model;

import com.spring_notes.model.Phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class PhonePurchase
{
	@Autowired
	@Qualifier("autowired_setters")
	private Phone phone;

	@Autowired
	@Value("5")
	private int qty;

	public PhonePurchase() {}

	public PhonePurchase(Phone phone)
	{
		this.phone = phone;
		this.qty = 3;
	}


	public void setPhone(Phone phone)
	{
		this.phone = phone;
	}

	public void setQty(int qty)
	{
		this.qty = qty;
	}

	@Override
	public String toString()
	{
		return String.format("Customer bought %d of the following: %s", this.qty, this.phone.toString());
	}

}