package de.thunderfrog;

/*
 * Es gibt viele verschiedene Arten von Fahrzeugen, die alle
 * Kindklassen dieser Klasse sein sollen:
 * Autos: SUV, Sportwagen, Lkw
 * Motorräder
 * Sportboote
 */

public abstract class Fahrzeug {
	/*
	 * Welche Felder brauchen wir?
	 * 
	 * Standardmäßig werden Felder auf private gesetzt
	 */
	private String hersteller;
	private int leistung;
	private int baujahr;
	/*
	 * Welche Methoden?
	 * Was sollen alle Fahrzeuge können?
	 * 
	 * Alle Fahrzeuge fahren irgendwie anders... diese Fahrenmethode würde
	 * also von den Kindklassen sowieso überschrieben.
	 * Also definiere ich sie erst gar nicht :(
	 * 
	 * Diese Methode hat einfach keinen Methodenbody
	 * - ich mach sie abstract
	 * Abstrakte Methoden haben eine Methodensignatur 
	 * (Namen und Übergabeparameter), aber keinen Body
	 * 
	 * Nur abstrakte Klassen dürfen abstrakte Methoden haben!
	 */
	public abstract void fahren();
	
	/*
	 * Obwohl die Klasse Fahrzeug abstract ist,
	 * hat sie einen Konstruktor
	 */
	public Fahrzeug(String hersteller, int leistung, int baujahr) {
		this.hersteller = hersteller;
		this.leistung = leistung;
		this.baujahr = baujahr;
	}
	
	/*
	 * Um die eingetragenen Werte zu sehen, schreibe ich eine toString()-
	 * Methode
	 */
	@Override
	public String toString() {
		String rueckgabe = "Fahrzeug von "+hersteller+" kW:"+leistung+" Baujahr: "+baujahr;
		return rueckgabe;
	}
	
}
