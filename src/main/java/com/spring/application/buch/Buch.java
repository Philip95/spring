package com.spring.application.buch;

import java.util.Date;

import com.spring.application.produkt.Produkt;

public class Buch extends Produkt {

	private String isbn;
	private int seitenanzahl;
	private String klappentext;
	private String verlag;
	private String auflage;
		


	public Buch(String name, String genre, double preis, String sprache, Date erscheinungsdatum, int altersfreigabe‎,
			String isbn, int seitenanzahl, String klappentext, String verlag, String auflage) {
		
		super(name, genre, preis, sprache, erscheinungsdatum, altersfreigabe‎);
		
		this.isbn = isbn;
		this.seitenanzahl = seitenanzahl;
		this.klappentext = klappentext;
		this.verlag = verlag;
		this.auflage = auflage;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getSeitenanzahl() {
		return seitenanzahl;
	}

	public String getKlappentext() {
		return klappentext;
	}

	public String getVerlag() {
		return verlag;
	}

	public String getAuflage() {
		return auflage;
	}	
	
	@Override
	public String toString() {
		return "Buch [isbn=" + isbn + ", seitenanzahl=" + seitenanzahl + ", klappentext=" + klappentext + ", verlag="
				+ verlag + ", auflage=" + auflage + "]";
	}
}
