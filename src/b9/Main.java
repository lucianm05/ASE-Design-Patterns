package b9;

// Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o rezervare sa fie permisă doar dacă aceasta este realizată pentru minim 4 persoane. În sens contrar rezervarea nu este realizata, iar persoanele sunt rugate să se prezinte la restaurant deoarece sunt suficiente locuri pentru mesele de doua persoane. Sa se realizeze un nivel intermediar care sa condiționeze realizarea rezervărilor de numărul de persoane.

// => Proxy

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare2Pers = new Rezervare(2);
		Rezervare rezervare4Pers = new Rezervare(4);
		ProxyRezervare rezervare2PersProxy = new ProxyRezervare(rezervare2Pers);
		ProxyRezervare rezervare4PersProxy = new ProxyRezervare(rezervare4Pers);
		
		rezervare2Pers.save();
		rezervare4Pers.save();
		
		rezervare2PersProxy.save();
		rezervare4PersProxy.save();
	}

}
