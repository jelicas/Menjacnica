package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute = new LinkedList<>();
	@Override
	public void dodajKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar datum) {
		Valuta valuta = new Valuta();
		try {
			valuta.setNaziv(naziv);
			valuta.setSkraceniNaziv(skraceniNaziv);
			valuta.setProdajniKurs(prodajniKurs);
			valuta.setKupovniKurs(kupovniKurs);
			valuta.setSrednjiKurs(srednjiKurs);
			valuta.setDatum(datum);
			
			valute.add(valuta);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void obrisiKursValuteZaOdredjeniDan(String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar datum) {
		Valuta valuta = new Valuta();
		try {
			valuta.setNaziv(naziv);
			valuta.setSkraceniNaziv(skraceniNaziv);
			valuta.setProdajniKurs(prodajniKurs);
			valuta.setKupovniKurs(kupovniKurs);
			valuta.setSrednjiKurs(srednjiKurs);
			valuta.setDatum(datum);
			
			valute.remove(valuta);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Valuta pronadjiIVratiKursValuteZaOdredjeniDan(GregorianCalendar datum) {
		try {
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getDatum() == datum)
					return valute.get(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
