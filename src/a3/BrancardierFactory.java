package a3;

public class BrancardierFactory implements Factory {

	@Override
	public PersonalSpital create() {
		return new Brancardier();
	}
	
}
