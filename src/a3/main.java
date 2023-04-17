package a3;

//În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
//Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
//PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
//nu fie necesare modificări în codul existent.
// => Factory Method

public class main {
	public static void afisare(Factory factory) {
		PersonalSpital angajat = factory.create();
		angajat.descriere();
	}
	
	public static void main(String[] args) {
		afisare(new BrancardierFactory());
		afisare(new AsistentFactory());
		afisare(new MedicFactory());
	}
}
