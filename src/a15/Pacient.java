package a15;

public class Pacient {
	private String name;
	
	public Pacient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void interneaza() {
		System.out.println("Pacientul " + this.name + " a fost internat");
	}
	
	public void trateaza() {
		System.out.println("Pacientul " + this.name + " a fost tratat");
	}
}
