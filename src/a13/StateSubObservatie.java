package a13;

public class StateSubObservatie implements State {

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul " + pacient.getName() + " se afla sub observatie");
		pacient.setState(this);
	}

}
