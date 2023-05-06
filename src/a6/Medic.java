package a6;

public class Medic {
	public boolean verificaPacient(Pacient pacient) {
		return pacient.getGravitate() >= 0.5;
	}
}
