package de.thunderfrog;

public class Sportboot extends Fahrzeug{
	/*
	 * Wenn ich keinen Konstruktor angebe, versucht der
	 * Default-Konstruktor in seiner ersten Zeile den
	 * parameterlosen Konstruktor der Oberklasse aufzurufen - 
	 * den gibt es aber nicht. Fahrzeug hat keinen 
	 * parameterlosen Konstruktor :(
	 * 
	 * Also schreibe ich hier einen Konstruktor der
	 * den parametrisierten Konstruktor der Oberklasse aufruft:
	 */
	public Sportboot(String hersteller, int leistung, int baujahr) {
		super(hersteller,leistung,baujahr);
	}
	
	
	
	public void fahren() {
		System.out.println("*wisch* *wisch*");
	}
}
