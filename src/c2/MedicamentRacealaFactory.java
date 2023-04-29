package c2;

public class MedicamentRacealaFactory implements Factory {

	@Override
	public Medicament create() {
		return new MedicamentRaceala();
	}

}
