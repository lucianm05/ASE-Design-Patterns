package a14;

public class Internare extends Template {
	public Internare(int pacientCode) {
		super(pacientCode);
	}

	@Override
	public void analyzeSeverity(int code) {
		System.out.println("Se analizeaza severitatea pacientului " + this.pacientCode);
	}

	@Override
	public void verifyAvailability(int code) {
		System.out.println("Se verifica disponibilitatea in saloane");
	}

	@Override
	public void issueForm(int code) {
		System.out.println("Se emite fisa de internare");
	}

}
