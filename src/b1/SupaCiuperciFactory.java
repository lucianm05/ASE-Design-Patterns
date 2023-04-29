package b1;

public class SupaCiuperciFactory implements Factory {

	@Override
	public Supa create() {
		return new SupaCiuperci();
	}

}
