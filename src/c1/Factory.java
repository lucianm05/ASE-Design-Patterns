package c1;

public class Factory {
	public Medicament create(TipMedicament tip, int pret, String denumire) {
		switch(tip) {
			case raceala:
				return new MedicamentRaceala(pret, denumire);
			case durere:
				return new MedicamentDurere(pret, denumire);
			case body:
				return new MedicamentBody(pret, denumire);
			default:
				return null;
		}
	}
}
