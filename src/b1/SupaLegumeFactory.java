package b1;

public class SupaLegumeFactory implements Factory {

	@Override
	public Supa create() {
		return new SupaLegume();
	}

}
