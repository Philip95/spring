package com.spring.application.produkt;

import java.util.Date;

public class Produkt {
	
	private String name;
	private String genre;
	private double preis;
	private String sprache;
	private Date erscheinungsdatum;
	private int altersfreigabe‎;

	public Produkt(String name, String genre, double preis, String sprache, Date erscheinungsdatum, int altersfreigabe‎) {
		super();
		this.name = name;
		this.genre = genre;
		this.preis = preis;
		this.sprache = sprache;
		this.erscheinungsdatum = erscheinungsdatum;
		this.altersfreigabe‎ = altersfreigabe‎;
	}

	public String getGenre() {
		return genre;
	}

	public double getPreis() {
		return preis;
	}

	public String getSprache() {
		return sprache;
	}

	public Date getErscheinungsdatum() {
		return erscheinungsdatum;
	}

	public int getAltersfreigabe‎() {
		return altersfreigabe‎;
	}
	
	public String name() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Produkt [name=" + name + ", genre=" + genre + ", preis=" + preis + ", sprache=" + sprache
				+ ", erscheinungsdatum=" + erscheinungsdatum + ", altersfreigabe‎=" + altersfreigabe‎ + "]";
	}
}
