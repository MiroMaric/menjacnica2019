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
		this();
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
	}

	public Valuta(String naziv, String skracenNaziv, HashMap<String, Kurs> dnevniKursevi) {
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
		this.dnevniKursevi = dnevniKursevi;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkracenNaziv() {
		return skracenNaziv;
	}

	public void setSkracenNaziv(String skracenNaziv) {
		this.skracenNaziv = skracenNaziv;
	}

	public HashMap<String, Kurs> getDnevniKursevi() {
		return dnevniKursevi;
	}

	public void setDnevniKursevi(HashMap<String, Kurs> dnevniKursevi) {
		this.dnevniKursevi = dnevniKursevi;
	}
	
}
