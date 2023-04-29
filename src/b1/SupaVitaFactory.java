package b1;

public class SupaVitaFactory implements Factory {

	@Override
	public Supa create() {
		return new SupaVita();
	}

}
