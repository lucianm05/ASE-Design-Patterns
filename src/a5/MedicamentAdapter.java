package a5;

import a5.farmacie.IMedicamentFarmacie;
import a5.spital.IMedicamentSpital;

public class MedicamentAdapter implements IMedicamentFarmacie {
	private IMedicamentSpital medicamentSpital;
	
	public MedicamentAdapter(IMedicamentSpital medicamentSpital) {
		this.medicamentSpital = medicamentSpital;
	}

	@Override
	public void cumparaMedicament() {
		this.medicamentSpital.achizitioneazaMedicament();
	}
}
