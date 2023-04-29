package c2;

public class MedicamentRaceala extends Medicament {
	public MedicamentRaceala() {};
	
	public MedicamentRaceala(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		if(pret == 0 || denumire == null) {
			System.out.println("Medicament raceala");
			return;
		}
			
		System.out.println("Medicament raceala: " + denumire + ", pret: " + pret + " lei");
	}
}
