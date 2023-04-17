package a3;

public class AsistentFactory implements Factory {

	@Override
	public PersonalSpital create() {
		return new Asistent();
	}
	
}
