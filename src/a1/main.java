package a1;

//Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
//are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
//papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
//in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de
//tipul pacient cu opțiuni extra.
// => Builder

public class main {
	public static void main(String[] args) {
		Pacient pacient1 = new PacientBuilder().setPatRabatabil(true).setHalat(true).build();
		Pacient pacient2 = new PacientBuilder().setPapuci(true).build();
		
		System.out.println(pacient1.toString());
		System.out.println(pacient2.toString());
	}
}
