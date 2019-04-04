package domen;

import java.util.GregorianCalendar;

public class Kurs {
	
	private int prodajni;
	private int srednji;
	private int kupovni;
	private GregorianCalendar datum;
	
	public Kurs() {
		
	}

	public Kurs(int prodajni, int srednji, int kupovni, GregorianCalendar datum) {
		super();
		this.prodajni = prodajni;
		this.srednji = srednji;
		this.kupovni = kupovni;
		this.datum = datum;
	}

	public int getProdajni() {
		return prodajni;
	}

	public void setProdajni(int prodajni) {
		this.prodajni = prodajni;
	}

	public int getSrednji() {
		return srednji;
	}

	public void setSrednji(int srednji) {
		this.srednji = srednji;
	}

	public int getKupovni() {
		return kupovni;
	}

	public void setKupovni(int kupovni) {
		this.kupovni = kupovni;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
}
