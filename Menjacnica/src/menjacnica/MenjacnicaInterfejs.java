package menjacnica;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs, double kupovniKurs, double srednjiKurs, GregorianCalendar datum);
	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs, double kupovniKurs, double srednjiKurs, GregorianCalendar datum);
	public Valuta pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum);
}

