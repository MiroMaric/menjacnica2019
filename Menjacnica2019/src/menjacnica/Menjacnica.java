package menjacnica;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import domen.Valuta;
import domen.Kurs;

public class Menjacnica implements IMenjacnica{

	private List<Valuta> valute;
	
	public Menjacnica() {
		valute = new LinkedList<>();
	}

	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs) {
		if(valuta==null || kurs==null)
			throw new RuntimeException("Podaci o valuti i kursu moraju biti validni");
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		for(Valuta v:valute){
			if(v.equals(valuta)){
				v.getDnevniKursevi().put(sdf.format(kurs.getDatum().getTime()), kurs);
				return;
			}
		}
		valute.add(valuta);
		valuta.getDnevniKursevi().put(sdf.format(kurs.getDatum().getTime()), kurs);
	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		if(valuta==null || datum==null)
			throw new RuntimeException("Podaci o valuti i datumu moraju biti validni");
		for(Valuta v:valute){
			if(v.equals(valuta)){
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				Kurs kurs = v.getDnevniKursevi().remove(sdf.format(datum.getTime()));
				if(kurs==null)
					throw new RuntimeException("Ne postoji kurs koji je povezan za prosledjenim datumom");
				return;
			}
		}
		throw new RuntimeException("Ne postoji data valuta");
	}

	@Override
	public Kurs vratiKurs(Valuta valuta, GregorianCalendar datum) {
		if(valuta==null || datum==null)
			throw new RuntimeException("Podaci o valuti i datumu moraju biti validni");
		for(Valuta v:valute){
			if(v.equals(valuta)){
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				Kurs kurs = v.getDnevniKursevi().get(sdf.format(datum.getTime()));
				if(kurs==null)
					throw new RuntimeException("Ne postoji kurs koji je povezan za prosledjenim datumom");
				return kurs;
			}
		}
		throw new RuntimeException("Ne postoji data valuta");
	}
	

}
