package c1;

public class MedicamentBody extends Medicament {
	public MedicamentBody(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		System.out.println("Medicament body: " + denumire + ", pret: " + pret + " lei");
	}
}
