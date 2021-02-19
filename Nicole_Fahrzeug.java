package c.abstrakt;

public abstract class Nicole_Fahrzeug {
	private String hersteller;
	private int leistung, baujahr;
	
	public abstract void fahren();
	public Nicole_Fahrzeug(String hersteller, int leistung, int baujahr) {
		this.hersteller = hersteller;
		this.leistung = leistung;
		this.baujahr = baujahr;
	}
	
	@Override
	public String toString() {
		String rueckgabe = "Fahrzeug von "+hersteller+" kW:"+leistung+" Baujahr: "+baujahr;
		return rueckgabe;
	}

	
}
