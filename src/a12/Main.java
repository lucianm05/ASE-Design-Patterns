package a12;

// Spitalul dorește să anunțe toți pacienții care au fost în spital ori de câte ori apare vreo urgență cu privire la viruși existenți în oraș. Astfel se dorește implementarea unui modul care atunci când apare o epidemie sau un virus nou să se trimită notificări tuturor persoanelor abonate la notificările spitalului.

// => Observer

public class Main {

	public static void main(String[] args) {
		Spital spital = new Spital();
		
		Pacient pacient1 = new Pacient("Pacient 1");
		Pacient pacient2 = new Pacient("Pacient 2");
		Pacient pacient3 = new Pacient("Pacient 3");
		
		spital.addObserver(pacient1);
		spital.addObserver(pacient2);
		spital.addObserver(pacient3);
		
		spital.sendUpdate("A inceput nebunia");
		spital.sendUpdate("Pe ei maa");
	}

}
