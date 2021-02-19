package c.abstrakt;

public class Nicole_Auto extends Nicole_Fahrzeug {
	private int anzahlRaeder = 4;
	
	@Override
	public void fahren() {
		System.out.println("*rampampampmapmam* *wrimmwrimm*");
	}
	public void raeder() {
		System.out.println("Das Auto hat " + anzahlRaeder + " Raeder!");
	}
	
	
	public Nicole_Auto(String hersteller, int leistung, int baujahr, int anzahlRaeder) {
		super(hersteller, leistung, baujahr);
		this.anzahlRaeder = anzahlRaeder;
	}

}
