package menjacnica;

import java.util.GregorianCalendar;

import domen.Kurs;
import domen.Valuta;

public interface IMenjacnica {
	
	void dodajKurs(Valuta valuta,Kurs kurs);
	void obrisiKurs(Valuta valuta,GregorianCalendar datum);
	Kurs vratiKurs(Valuta valuta,GregorianCalendar datum);
	
	
}
