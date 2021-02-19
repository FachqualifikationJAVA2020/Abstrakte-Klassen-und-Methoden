package c.abstrakt;

public class Nicole_Sportboot extends Nicole_Fahrzeug{

	public Nicole_Sportboot(String hersteller, int leistung, int baujahr) {
		super(hersteller,leistung,baujahr);
	}
	
	public void fahren() {
		System.out.println("*wisch* *wisch*");
	}
}