package a2;

public class Factory {
	public PersonalSpital create(TipPersonalSpital tipAngajat) {
		switch(tipAngajat) {
			case brancardier: 
				return new Brancardier();
			case asistent:
				return new Asistent();
			case medic:
				return new Medic();
			default:
				return null;
		}
	}
}
