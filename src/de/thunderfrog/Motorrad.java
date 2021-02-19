package de.thunderfrog;

public class Motorrad extends Fahrzeug{
	/*
	 * In der Kindklasse kann ich zus�tzliche Felder haben:
	 */
	private int anzahlRaeder = 2;
	/*
	 * Damit Motorrad selber nicht abstrakt sein muss,
	 * �berschreibe ich die geerbte abstrakte Methode der Oberklasse:
	 */
	@Override
	public void fahren() {
		System.out.println("*brumm* *brumm*");
	}
	/*
	 * Beim �berschreiben muss die Sichtbarkeit mindestens gleich gro� sein,
	 * hier also public
	 */
	
	/*
	 * Um die Felder zu belegen,
	 * schreibe ich einen parametrisierten Konstruktor
	 */
	public Motorrad(String hersteller, int leistung, int baujahr) {
		/*
		 * Obwohl die Elternklasse das Feld hersteller hat,
		 * darf ich in der Kindklasse nicht darauf zugreifen,
		 * denn es ist private
		 */
//		this.hersteller = hersteller;
		/*
		 * Aber weil es einen parametrisierten Konstruktor der Oberklasse
		 * gibt, kann ich den nutzen
		 */
		super(hersteller,leistung,baujahr);
		/*
		 * Ich rufe den Konstruktor der Oberklasse auf mit dem Schl�sselwort
		 * super()
		 * 
		 * Das darf ich nur in der ersten Zeile meines Konstruktors tun
		 */
	}
	
}
