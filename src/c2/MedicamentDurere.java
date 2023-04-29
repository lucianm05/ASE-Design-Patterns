package c2;

public class MedicamentDurere extends Medicament {
	public MedicamentDurere() {}
	
	public MedicamentDurere(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		if(pret == 0 || denumire == null) {
			System.out.println("Medicament durere");
			return;
		}	
	
		System.out.println("Medicament durere: " + denumire + ", pret: " + pret + " lei");
	}
}
