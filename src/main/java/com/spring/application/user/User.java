package com.spring.application.user;

import com.spring.application.person.Person;

public class User extends Person {

	public User(String vorname, String nachname) {
		super(vorname, nachname);
	}

	@Override
	public String toString() {
		return "User [getVorname()=" + getVorname() + ", getBeschreibung()=" + getBeschreibung() + ", getNachname()="
				+ getNachname() + ", getGebdatum()=" + getGebdatum() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
