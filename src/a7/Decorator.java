package a7;

public abstract class Decorator implements IRezultat {
	protected IRezultat rezultat;
	
	public Decorator(IRezultat rezultat) {
		this.rezultat = rezultat;
	}
	
	@Override
	public void acordaRezultat() {
		this.rezultat.acordaRezultat();
		System.out.println("Se acorda rezultat prin intermediul platformei online");
	}
}
