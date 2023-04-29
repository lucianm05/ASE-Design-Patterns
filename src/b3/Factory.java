package b3;

public class Factory {
	public Supa build(TipSupa tip) {
		switch(tip) {
			case legume:
				return new SupaLegume();
			case vita:
				return new SupaVita();
			case ciuperci:
				return new SupaCiuperci();
			default:
				return null;
		}
	}
}
