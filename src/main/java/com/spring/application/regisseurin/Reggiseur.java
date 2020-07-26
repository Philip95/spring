package com.spring.application.regisseurin;

import java.util.Date;

import com.spring.application.person.Person;

public class Reggiseur extends Person {

	public Reggiseur(String vorname, String nachname, Date gebdatum, String beschreibung, int p_id) {
		super(vorname, nachname, gebdatum, beschreibung, p_id);
	}

	@Override
	public String toString() {
		return "Reggiseur [getVorname()=" + getVorname() + ", getBeschreibung()=" + getBeschreibung()
				+ ", getNachname()=" + getNachname() + ", getGebdatum()=" + getGebdatum() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
