package menjacnica;

import java.util.GregorianCalendar;

import interfejs.Interfejs;

public class Implementacija implements Interfejs {

	

	public void dodajKurs(double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		Kurs kurs=new Kurs();
		kurs.setDatum(datum);
		kurs.setKupovni(kupovni);
		kurs.setProdajni(prodajni);
		kurs.setSrednji(srednji);
		
	
		
	}

	
	public Kurs obrisiKurs(GregorianCalendar datum) {
		//nisam siguran kako
		return null;
	}

	
	public Kurs pronadnjiKurs(GregorianCalendar datum) {	
		//nisam siguran kako
		return null;
	}
	

}
