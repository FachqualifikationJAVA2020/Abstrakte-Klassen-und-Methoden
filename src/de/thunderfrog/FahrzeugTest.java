package de.thunderfrog;

public class FahrzeugTest {
	/*
	 * Hier m�chte ich die verschiedenen Fahrzeugklassen instanziieren
	 * und ausprobieren "probefahren" :)
	 * 
	 * Fahrzeug selber kann ich nicht instanziieren, weil es abstract ist
	 */
	public static void main(String[] args) {
//		Fahrzeug fz = new Fahrzeug();
		
		Motorrad mr = new Motorrad("Harley-Davidson",150,1970);
		mr.fahren();
		/*
		 * Motorrad ist ein Fahrzeug, also geht:
		 */
		Fahrzeug f = mr;
		f.fahren();
		/*
		 * Es wird die Motorrad-Methode ausgef�hrt, denn in der
		 * Variablen ist ein Motorrad enthalten
		 * 
		 * Ich darf an einer Variablen vom Typ Fahrzeug die fahren()
		 * Methode aufrufen, weil Fahrzeug eine fahren()-Methode hat:
		 * Also haben ALLE KINDKLASSEN VON FAHRZEUG EINE FAHREN()-METHODE
		 */
		Sportboot speedy = new Sportboot("Yamaha",600,2017);
		speedy.fahren();
		/*
		 * Und auch Sportboot ist ein Fahrzeug:
		 */
		f = speedy;
		f.fahren();
		/*
		 * Obwohl ich in Zeile 34 genau denselben Code habe wie in Zeile 19
		 * passiert etwas anderes, weil in der Variablen f ein anderes
		 * Objekt enthalten ist.
		 * Welches Objekt genau enthalten ist, wird erst zur Laufzeit des
		 * Programms bestimmt
		 * 
		 * 
		 * So, zu den Feldern:
		 * 
		 * Im mr ist ein Motorrad:
		 */
//		mr.hersteller = "Honda";
		/*
		 * So geht es nicht, Hersteller ist ja private
		 * 
		 * Also �ber den Konstruktor(hersteller,leistung,baujahr)
		 */
		mr = new Motorrad("Honda",400,2002);
		/*
		 * Um zu sehen, dass die Werte richtig in die richtigen Felder
		 * eingetragen wurden, geben wir das einmal aus: 
		 */
		System.out.println(mr);
	}
	
	
}
