package a3;

public class MedicFactory implements Factory {

	@Override
	public PersonalSpital create() {
		return new Medic();
	}

}
