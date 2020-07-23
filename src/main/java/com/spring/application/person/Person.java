package com.spring.application.person;

import java.util.Date;

public class Person {
	
	private String beschreibung;
	private String vorname;
	private String nachname;
	private Date gebdatum;
	
	//User Konstruktor
	public Person(String vorname, String nachname) {
		
		super();

		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	//Autor und Regie
	public Person(String vorname, String nachname, Date gebdatum, String beschreibung) {
		
		super();
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebdatum = gebdatum;
		this.beschreibung = beschreibung;
	}

	public String getVorname() {
		return vorname;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}

	public String getNachname() {
		return nachname;
	}

	public Date getGebdatum() {
		return gebdatum;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + gebdatum + "]";
	}
}
