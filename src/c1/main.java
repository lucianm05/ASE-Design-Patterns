package c1;

//Farmacia dorește ca toate medicamentele să facă parte dintr-o categorie. Categoriile sunt salvate ntr-un enum {Raceala, Durere, Body}. Fiecare medicament o sa aibă preț și denumire. Să se implementeze modul care va inițializa obiecte din familia medicamentelor

//=> Factory

public class main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Medicament medR = factory.create(TipMedicament.raceala, 18, "Parasinus");
		Medicament medD = factory.create(TipMedicament.durere, 10, "Nurofen");
		Medicament medB = factory.create(TipMedicament.body, 20, "???");
		
		medR.descriere();
		medD.descriere();
		medB.descriere();
	}

}
