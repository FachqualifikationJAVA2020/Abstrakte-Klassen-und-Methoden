package de.thunderfrog;

public class Auto extends Fahrzeug{

	private int anzahlRaeder = 4;

	public Auto(String hersteller, int leistung, int baujahr) {
		super(hersteller,leistung,baujahr);
	}
	public Auto(String hersteller, int leistung, int baujahr, int anzahlRaeder) {
		super(hersteller,leistung,baujahr);
		this.anzahlRaeder = anzahlRaeder;
	}



	public void fahren() {
		System.out.println("*mehrbrumm* *mehrbrumm*");
	}
}
