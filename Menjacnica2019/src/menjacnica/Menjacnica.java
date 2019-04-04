package menjacnica;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import domen.Kurs;
import domen.Valuta;

public class Menjacnica implements IMenjacnica{

private List<Valuta> valute;
	
	public Menjacnica() {
		valute = new LinkedList<>();
	}

	@Override
	public void dodajKurs(String valuta, Kurs kurs) {
		if(valuta==null || kurs==null)
			throw new RuntimeException("Podaci o valuti i kursu moraju biti validni");
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		for(Valuta v:valute){
			if(v.equals(valuta)){
				v.getDnevniKursevi().put(sdf.format(kurs.getDatum().getTime()), kurs);
				return;
			}
		}
		throw new RuntimeException("Ne postoji prosledjena valuta");
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
