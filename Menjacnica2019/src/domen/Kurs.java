package domen;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Kurs {
	
	private double prodajni;
	private double srednji;
	private double kupovni;
	private GregorianCalendar datum;
	
	public Kurs() {
		
	}

	public Kurs(double prodajni, double srednji, double kupovni, GregorianCalendar datum) {
		if(prodajni<=0 || srednji<=0 || kupovni<=0 || datum==null)
			throw new RuntimeException("Prodajni, srednji i kupovni kurs moraju biti pozitivni. Datum mora biti validan");
		this.prodajni = prodajni;
		this.srednji = srednji;
		this.kupovni = kupovni;
		this.datum = datum;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if(prodajni<=0)
			throw new RuntimeException("Prodajni kurs mora biti pozitivan");
		this.prodajni = prodajni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if(srednji<=0)
			throw new RuntimeException("Srednji kurs mora biti pozitivan");
		this.srednji = srednji;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if(kupovni<=0)
			throw new RuntimeException("Kupovni kurs mora biti pozitivan");
		this.kupovni = kupovni;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum==null)
			throw new RuntimeException("Datum mora biti validan");
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
