package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute = new LinkedList<>();

	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar datum) {
		Valuta valuta;
		try {
			valuta = new Valuta(naziv, skraceniNaziv, prodajniKurs, kupovniKurs, srednjiKurs, datum);
			valute.add(valuta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar datum) {
		Valuta valuta;
		try {
			valuta = new Valuta(naziv, skraceniNaziv, prodajniKurs, kupovniKurs, srednjiKurs, datum);
			valute.remove(valuta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Valuta pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum) {
		try {
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getDatum().compareTo(datum) == 0)
					return valute.get(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
