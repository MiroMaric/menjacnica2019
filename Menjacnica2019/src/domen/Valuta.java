package domen;

import java.util.HashMap;

public class Valuta {
	
	private String naziv;
	private String skracenNaziv;
	//Key:Datum (dd.MM.yyyy),Value:Kurs
	private HashMap<String, Kurs> dnevniKursevi;
	
	public Valuta() {
		dnevniKursevi = new HashMap<>();
	}

	public Valuta(String naziv, String skracenNaziv) {
		if(naziv==null || naziv.isEmpty() || skracenNaziv==null || skracenNaziv.isEmpty())
			throw new RuntimeException("Naziv i skracen valute naziv moraju biti validni");
		dnevniKursevi = new HashMap<>();
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
	}

	public Valuta(String naziv, String skracenNaziv, HashMap<String, Kurs> dnevniKursevi) {
		if(naziv==null || naziv.isEmpty() || skracenNaziv==null || skracenNaziv.isEmpty() || dnevniKursevi==null)
			throw new RuntimeException("Naziv i skracen valute i dnevni kursevi naziv moraju biti validni");
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
		this.dnevniKursevi = dnevniKursevi;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null || naziv.isEmpty())
			throw new RuntimeException("Naziv valute mora biti validan");
		this.naziv = naziv;
	}

	public String getSkracenNaziv() {
		return skracenNaziv;
	}

	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv==null || skracenNaziv.isEmpty())
			throw new RuntimeException("Skacen naziv valute mora biti validan");
		this.skracenNaziv = skracenNaziv;
	}

	public HashMap<String, Kurs> getDnevniKursevi() {
		return dnevniKursevi;
	}

	public void setDnevniKursevi(HashMap<String, Kurs> dnevniKursevi) {
		if(dnevniKursevi==null)
			throw new RuntimeException("Dnevni kursevi moraju biti validni");
		this.dnevniKursevi = dnevniKursevi;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
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
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenNaziv == null) {
			if (other.skracenNaziv != null)
				return false;
		} else if (!skracenNaziv.equals(other.skracenNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenNaziv=" + skracenNaziv + "]";
	}
	
	
}
