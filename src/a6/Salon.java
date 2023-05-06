package a6;

public class Salon {
	private boolean arePatLiber;
	private int numar;
	
	public Salon(boolean arePatLiber, int numar) {
		super();
		this.arePatLiber = arePatLiber;
		this.numar = numar;
	}
	
	public boolean isArePatLiber() {
		return arePatLiber;
	}
	public void setArePatLiber(boolean arePatLiber) {
		this.arePatLiber = arePatLiber;
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
}
