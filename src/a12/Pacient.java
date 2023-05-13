package a12;

public class Pacient implements Observer {
	private String name;
	
	public Pacient(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name + " a primit mesajul: " + message);
	}
	
	
}
