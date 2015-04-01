package interfejs;

import java.util.GregorianCalendar;
import menjacnica.Kurs;
public interface Interfejs {
	
	public void dodajKurs(double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public Kurs obrisiKurs(GregorianCalendar datum);
	public Kurs pronadnjiKurs(GregorianCalendar datum);
	

}
