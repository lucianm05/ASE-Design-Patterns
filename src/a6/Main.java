package a6;

// Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.

// => Facade

public class Main {

	public static void main(String[] args) {
		Pacient pacientStareUsoara = new Pacient("Testulescu", 0.2);
		Pacient pacientStareGrava = new Pacient("Xulescu", 0.8);
		
		Spital spital = new Spital();
		
		Facade facade = new Facade();
		
		facade.internarePacient(pacientStareUsoara, spital);
		facade.internarePacient(pacientStareGrava, spital);
		facade.internarePacient(pacientStareGrava, spital);
		facade.internarePacient(pacientStareGrava, spital);
		facade.internarePacient(pacientStareGrava, spital);
	}

}
