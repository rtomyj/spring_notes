package com.spring_notes.component;

import com.spring_notes.model.Computer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sample")
@Scope("prototype")
public class ComputerComponent extends Computer
{
	public ComputerComponent()
	{
		super("MacBook Pro", 2014);
	}
}