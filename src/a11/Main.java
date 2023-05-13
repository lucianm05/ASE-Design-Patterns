package a11;

// Este dorită implementarea modului de plată pentru pacienții care au fost internați în spital. Modul de plată îl decide persoana care plătește în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau cash. Sa se implementeze modulul de plata.

// => Strategy

public class Main {

	public static void main(String[] args) {
		Strategy cardPayment = new CardPayment();
		Strategy cashPayment = new CashPayment();
		
		Pacient mihai = new Pacient("Mihai");
		Pacient gabi = new Pacient("Gabi", cardPayment);
		
		mihai.pay();
		mihai.setPaymentStrategy(cashPayment);
		mihai.pay();
		
		gabi.pay();
	}

}
