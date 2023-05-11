package b7;

// Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului dorește ca atunci când este printat o notă să se printeze și o felicitare de la Mulți ani pentru client. Se dorește adăugarea acestei noi funcționalități pentru clasa NotaDePlata la printare.

// => Decorator

public class Main {

	public static void main(String[] args) {
		INotaDePlata notaDePlata = new NotaDePlata();
		INotaDePlata notaDePlataDecorata = new NotaDePlataDecorator(notaDePlata);
		
		notaDePlata.printeaza();
		notaDePlataDecorata.printeaza();
	}

}
