package c1;

public class MedicamentRaceala extends Medicament {
	public MedicamentRaceala(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		System.out.println("Medicament raceala: " + denumire + ", pret: " + pret + " lei");
	}
}
