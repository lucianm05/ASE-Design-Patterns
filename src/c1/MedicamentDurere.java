package c1;

public class MedicamentDurere extends Medicament {
	public MedicamentDurere(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		System.out.println("Medicament durere: " + denumire + ", pret: " + pret + " lei");
	}
}
