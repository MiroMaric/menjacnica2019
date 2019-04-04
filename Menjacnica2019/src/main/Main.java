package main;

import java.util.GregorianCalendar;

import domen.Kurs;
import domen.Valuta;
import menjacnica.Menjacnica;

public class Main {
	
	public static void main(String args[]){
		Menjacnica menjacnica = new Menjacnica();
		menjacnica.dodajKurs(new Valuta("Euro", "EUR"), new Kurs(120, 120, 10, new GregorianCalendar()));
		GregorianCalendar gc = new GregorianCalendar();
		gc.add(GregorianCalendar.DAY_OF_YEAR, 5);
		menjacnica.dodajKurs(new Valuta("Euro", "EUR"), new Kurs(120, 120, 10, gc));
		System.out.println(menjacnica.vratiKurs(new Valuta("Euro", "EUR"), new GregorianCalendar()));
		menjacnica.obrisiKurs(new Valuta("Euro", "EUR"), gc);
		//Exception
		System.out.println(menjacnica.vratiKurs(new Valuta("Euro", "EUR"), gc));
	}
	
}
