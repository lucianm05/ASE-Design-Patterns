package a13;

public class StateInternat implements State {

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul " + pacient.getName() + " este internat");
		pacient.setState(this);
	}
	
}
