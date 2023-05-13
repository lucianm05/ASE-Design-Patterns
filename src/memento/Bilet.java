package memento;

public class Bilet {
	private int pret;
	
	public Bilet(int pret) {
		this.pret = pret;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}
	
	public void descriere() {
		System.out.println("Biletul costa " + this.pret);
	}
	
	public MementoBilet saveMemento() {
		return new MementoBilet(this.pret);
	}
	
	public void restoreMemento(MementoBilet memento) {
		this.pret = memento.getPret();
	}
}
