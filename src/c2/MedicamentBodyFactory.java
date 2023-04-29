package c2;

public class MedicamentBodyFactory implements Factory {
	@Override
	public Medicament create() {
		return new MedicamentBody();
	}

}
