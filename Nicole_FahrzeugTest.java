package c.abstrakt;

public class Nicole_FahrzeugTest {
	public static void main(String[] args) {

		Nicole_Motorrad mr = new Nicole_Motorrad("Harley-Davidson",150,1970);
		mr.fahren();

		Nicole_Fahrzeug f = mr;
		f.fahren();

		Nicole_Sportboot speedy = new Nicole_Sportboot("Yamaha",600,2017);
		speedy.fahren();

		f = speedy;
		f.fahren();

		mr = new Nicole_Motorrad("Honda",400,2002);

		System.out.println(mr);
		
		Nicole_Auto auto = new Nicole_Auto("Opel", 333, 1990, 4);
		auto.raeder();
		auto.fahren();
		System.out.println(auto);
	}
}

