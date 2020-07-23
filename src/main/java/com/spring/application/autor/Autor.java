package com.spring.application.autor;

import java.util.Date;

import com.spring.application.person.Person;

public class Autor extends Person {
	
	private int id;
	

	public Autor(String vorname, String nachname, Date gebdatum, int id, String beschreibung) {
		
		super(vorname, nachname, gebdatum, beschreibung);
		
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", beschreibung=" + "]";
	}
	
	
	
	
}
