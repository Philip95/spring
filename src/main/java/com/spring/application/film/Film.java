package com.spring.application.film;

import java.util.Date;

import com.spring.application.produkt.Produkt;

public class Film extends Produkt {
	private int laenge;
	private String produktionsland;
	private String beschreibung;
	
	public Film(String name, String genre, double preis, String sprache, Date erscheinungsdatum, int altersfreigabe‎,
			int laenge, String produktionsland, String beschreibung) {
		
		super(name, genre, preis, sprache, erscheinungsdatum, altersfreigabe‎);
		
		this.laenge = laenge;
		this.produktionsland = produktionsland;
		this.beschreibung = beschreibung;
	}

	public int getLaenge() {
		return laenge;
	}

	public String getProduktionsland() {
		return produktionsland;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	@Override
	public String toString() {
		return "Film [laenge=" + laenge + ", produktionsland=" + produktionsland + ", beschreibung=" + beschreibung
				+ "]";
	}
}
