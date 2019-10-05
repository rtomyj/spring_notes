package com.spring_notes;

import com.spring_notes.config.JavaBasedConfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringNotesApp {

	public static void main(String[] args) {
		new SpringNotesXML().xmlConfigBaseExample();

		/*
		SpringNotesGeneral generalBeanKnowledge = new SpringNotesGeneral();
		generalBeanKnowledge.beanScope();
		generalBeanKnowledge.closeContext();

		new SpringNotesAnnotation().annotationConfigBaseExample();

		new SpringNotesJavaConfig().javaConfigBaseExample();
		*/

	}


}
