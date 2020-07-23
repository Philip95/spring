package com.spring.application.bewertung;

public class Bewertung {
	private int anzahlBewertungen;
	private int summeBewertungen;
	
	public Bewertung(int anzahlBewertungen, int summe) {
		super();
		this.anzahlBewertungen = anzahlBewertungen;
		this.summeBewertungen = summe;
	}

	public int getAnzahlBewertungen() {
		return anzahlBewertungen;
	}

	public int getSummeBewertungen() {
		return summeBewertungen;
	}

	@Override
	public String toString() {
		return "Bewertung [anzahlBewertungen=" + anzahlBewertungen + ", summeBewertungen=" + summeBewertungen + "]";
	}
}
