package a10;

// Pentru fiecare internare trebuie să se rețină informații cu privire la pacientul internat precum: nume, număr de telefon, adresă, etc, precum și informațiile despre salonul unde este internat: număr salon, număr pat, număr zile spitalizare, etc. Astfel, dacă un pacient este internat de mai multe ori de-a lungul timpului, informațiile despre acesta sunt aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze modulul de memorare al tuturor internărilor astfel încât să nu ocupe memorie foarte multă.

// => Flyweight

public class Main {

	public static void main(String[] args) {
		FlyweightFactory fabrica = new FlyweightFactory();
		Pacient testulescu = fabrica.getPacient("Testulescu", "1234", "Bucuresti");
		Pacient xulescu = fabrica.getPacient("Xulescu", "12345679123", "Timisoara");
		
		Internare internare1 = new Internare(testulescu, 1, 2, 5);
		Internare internare2 = new Internare(testulescu, 2, 5, 10);
		Internare internare3 = new Internare(xulescu, 3, 5, 5);
		Internare internare4 = new Internare(testulescu, 1, 6, 2);
		
		internare1.descriere();
		internare2.descriere();
		internare3.descriere();
		internare4.descriere();
	}

}
