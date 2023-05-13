package a13;

public class StateExternat implements State {

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul " + pacient.getName() + " este externat");
		pacient.setState(this);
	}

}
