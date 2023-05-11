package b8;

public class Subsectiune extends AItem {
	public Subsectiune(String nume) {
		super(nume);
	}
	
	@Override
	public void descriere() {
		System.out.println("Subsectiune: " + this.nume);
	}
}
