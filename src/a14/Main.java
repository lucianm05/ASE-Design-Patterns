package a14;

// Internarea unui pacient se face după următorii pași: Se analizează dificultatea stării pacientului, Se verifica disponibilitatea in saloanele spitalului, Se emite fisa de internare. Sa se implementeze modului care realizează in aplicație internarea pacienților după acest pattern.

// => Template Method

public class Main {

	public static void main(String[] args) {
		Template internare1 = new Internare(0);
		Template internare2 = new Internare(1);
		
		internare1.hospitalize();
		internare2.hospitalize();
	}

}
