package a6;

public class Facade {
	
	
	public void internarePacient(Pacient pacient, Spital spital) {
		Medic medic = spital.getMedic();
		
		if(!medic.verificaPacient(pacient)) {
			System.out.println("Pacientul nu este in stare grava => nu este internat");
			return;
		}
		
		Salon salon = spital.gasesteSalonLiber();
		
		if(salon == null) {
			System.out.println("Nu exista salon liber => nu este internat");
			return;
		}
		
		spital.ocupaSalon(salon.getNumar());
		System.out.println("Pacientul a fost internat in salonul " + salon.getNumar());
	}
}
