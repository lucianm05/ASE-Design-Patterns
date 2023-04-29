package c2;

public class MedicamentDurereFactory implements Factory {

	@Override
	public Medicament create() {
		return new MedicamentDurere();
	}

}
