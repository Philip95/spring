package com.spring.application.autor;

import java.util.Date;

import com.spring.application.person.Person;

public class Autor extends Person {	

	public Autor(String vorname, String nachname, Date gebdatum, int id, String beschreibung) {
		
		super(vorname, nachname, gebdatum, beschreibung, id);
		
	}


	@Override
	public String toString() {
		return "Autor [id=" + ", beschreibung=" + "]";
	}
	
	
	
	
}
