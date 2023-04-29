package b2;

//Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la geam, scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul în care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra.

// => Builder

public class main {
	public static void main(String[] args) {
		Rezervare rezervare = new RezervareBuilder()
				.setAsezareGeam(true)
				.setMuzicaAmbientala(true)
				.setGenMuzica("House")
				.build();
		
		Rezervare rezervare2 = new RezervareBuilder()
				.setScauneErgonomice(true)
				.setDecorareaMesei(true)
				.build();
		
		rezervare.descriere();
		rezervare2.descriere();
	}
}
