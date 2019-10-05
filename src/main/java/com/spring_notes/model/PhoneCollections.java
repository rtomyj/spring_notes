package com.spring_notes.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneCollections
{
	private List<Phone> phones;
	private Set<Phone> uniquePhones;
	private Map<String, Phone> NAME_maps_PHONE;


	public void setPhones(List<Phone> phones)
	{
		this.phones = phones;
	}

	public void setUniquePhones(Set<Phone> uniquePhones) {
		this.uniquePhones = uniquePhones;
	}

	public void setNAME_maps_PHONE(Map<String, Phone> NAME_maps_PHONE) {
		this.NAME_maps_PHONE = NAME_maps_PHONE;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s %s", phones.toString(), uniquePhones.toString(), NAME_maps_PHONE.toString());
	}
}