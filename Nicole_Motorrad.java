package c.abstrakt;

public class Nicole_Motorrad extends Nicole_Fahrzeug {
	private int anzahlRaeder = 2;
	
	@Override
	public void fahren() {
		System.out.println("*brumm* *brumm*");
	}
	
	public Nicole_Motorrad(String hersteller, int leistung, int baujahr) {
		
	super(hersteller,leistung,baujahr);
		
	}
	
}
