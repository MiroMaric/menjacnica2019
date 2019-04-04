package domen;

import java.text.SimpleDateFormat;
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

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + kupovni;
		result = prime * result + prodajni;
		result = prime * result + srednji;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!sdf.format(datum.getTime()).equals(sdf.format(other.datum.getTime())))
			return false;
		if (kupovni != other.kupovni)
			return false;
		if (prodajni != other.prodajni)
			return false;
		if (srednji != other.srednji)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kurs [prodajni=" + prodajni + ", srednji=" + srednji + ", kupovni=" + kupovni + ", datum=" + 
				new SimpleDateFormat("dd.MM.yyyy").format(datum.getTime())
				+ "]";
	}
	
}
