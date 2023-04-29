package c2;

//Farmacia dorește ca toate medicamentele să facă parte dintr-una din categoriile: Raceala, Durere, Body. Fiecare medicament o sa aibă preț și denumire. Să se implementeze modul care va inițializa obiecte din familia medicamentelor. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de categorii să nu fie necesare modificări în codul existent.

// => Factory Method

public class main {
	
	public static void prescriere(Factory factory) {
		Medicament med = factory.create();
		med.descriere();
	}

	public static void main(String[] args) {
		prescriere(new MedicamentBodyFactory());
		prescriere(new MedicamentDurereFactory());
		prescriere(new MedicamentRacealaFactory());
	}

}
