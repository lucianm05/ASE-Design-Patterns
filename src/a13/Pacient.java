package a13;

public class Pacient {
	private String name;
	private State state;
	
	public Pacient(String name) {
		super();
		this.name = name;
		this.state = new StateInternat();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	
}
