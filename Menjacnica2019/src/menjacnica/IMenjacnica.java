package menjacnica;

import java.util.GregorianCalendar;

import domen.Kurs;

public interface IMenjacnica {
	
	void dodajKurs(String valuta,Kurs kurs);
	void obrisiKurs(String valuta,GregorianCalendar datum);
	Kurs vratiKurs(String valuta,GregorianCalendar datum);
	
	
}
