package a4;

public class Reteta implements IReteta {
	private String nume;
	private int cantitate;
	
	public Reteta(String nume, int cantitate) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public IReteta copiaza() {
		// TODO Auto-generated method stub
		return new Reteta(this.nume, this.cantitate);
	}
	
	@Override
	public void descriere() {
		System.out.println("Aceasta reteta este pentru " + nume);
	}	
}
