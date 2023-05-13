package a13;

import a13.Pacient;

// Spitalul dorește implementarea unui modul pentru gestiunea pacienților. Un pacient poate să aibă una din următoarele stări: Internat, SubObservatie, Externat. Atunci când un pacient este adus în spital intră în starea Internat. Daca starea sa de sănătate este gravă, atunci este trecut în starea SubObservatie. Cand se vindeca si este trimis acasa, pacientul intra in starea Externat.

public class Main {

	public static void main(String[] args) {
		Pacient pacient1 = new Pacient("Pacient 1");
		Pacient pacient2 = new Pacient("Pacient 2");
		Pacient pacient3 = new Pacient("Pacient 3");
		
		State stareInternat = new StateInternat();
		State stareSubObs = new StateSubObservatie();
		State stareExternat = new StateExternat();
		
		stareSubObs.doAction(pacient1);
		stareExternat.doAction(pacient2);
		stareSubObs.doAction(pacient3);
		stareExternat.doAction(pacient3);
		stareInternat.doAction(pacient2);
	}

}
