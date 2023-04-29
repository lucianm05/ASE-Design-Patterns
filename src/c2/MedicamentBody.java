package c2;

public class MedicamentBody extends Medicament {
	public MedicamentBody() {};
	
	public MedicamentBody(int pret, String denumire) {
		super(pret, denumire);
	}
	
	@Override
	public void descriere() {
		if(pret == 0 || denumire == null) {
			System.out.println("Medicament body");
			return;
		}
		
		System.out.println("Medicament body: " + denumire + ", pret: " + pret + " lei");
	}
}
