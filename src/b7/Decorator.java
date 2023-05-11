package b7;

public abstract class Decorator implements INotaDePlata {
	private INotaDePlata notaDePlata;
	
	public Decorator(INotaDePlata notaDePlata) {
		this.notaDePlata = notaDePlata;
	}
	
	@Override
	public void printeaza() {
		this.notaDePlata.printeaza();
		System.out.println("Se printeaza o felicitare");
	}
}
