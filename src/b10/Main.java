package b10;

// Pentru fiecare rezervare trebuie să se rețină informații cu privire la clientul restaurantului precum: nume, număr de telefon, adresă de mail, etc, precum și informațiile despre masa rezervata: număr masa, număr persoane, ora rezervare, etc. Astfel, dacă un client realizează mai multe rezervări, la fiecare rezervare, informațiile despre client sunt aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze modulul de memorare al rezervărilor astfel încât să nu ocupe memorie foarte multă.

// => Flyweight

public class Main {

	public static void main(String[] args) {
		Flyweight testulescu = FlyweightFactory.getClient("Testulescu", "1234", "testulescu@test.com");
		Flyweight xulescu = FlyweightFactory.getClient("Xulescu", "5678", "x@man.com");
		
		Rezervare rezervare1 = new Rezervare(1, 2, 19);
		Rezervare rezervare2 = new Rezervare(1, 4, 20);
		Rezervare rezervare3 = new Rezervare(2, 5, 17);
		Rezervare rezervare4 = new Rezervare(2, 7, 9);
		
		testulescu.rezerva(rezervare1);
		testulescu.rezerva(rezervare3);
		testulescu.rezerva(rezervare4);
		xulescu.rezerva(rezervare2);
	}

}
