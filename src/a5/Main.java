package a5;

import a5.farmacie.IMedicamentFarmacie;
import a5.farmacie.MedicamentFarmacie;
import a5.spital.IMedicamentSpital;
import a5.spital.MedicamentSpital;

//. Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea medicamente pe baza de rețetă. Spitalul încheie un contract cu o farmacie specializată și dorește să integreze sistemul informatic al farmaciei cu sistemul software existent în micul magazin de medicamente. Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât aplicația farmaciei să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa Medicament din aplicația spitalului are metodele achizitioneazaMedicament() și prezintaReteta(). Metoda prezintaReteta() este apelată din achizitioneazaMedicament() pentru verificarea rețetei. Clasa Medicament din aplicația farmaciei are o singură metodă cumpărăMedicament() în care nu se face verificarea rețetei, deoarece farmacia o să vândă medicamente și fără rețetă

// => Adapter

public class Main {

	public static void main(String[] args) {
		IMedicamentSpital medicamentSpital = new MedicamentSpital("Theraflu");
		IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen");
		
		medicamentSpital.achizitioneazaMedicament();
		medicamentFarmacie.cumparaMedicament();
		
		System.out.println();
		
		IMedicamentFarmacie medicamentAdapter = new MedicamentAdapter(medicamentSpital);
		
		medicamentAdapter.cumparaMedicament();
		medicamentFarmacie.cumparaMedicament();
	}

}
