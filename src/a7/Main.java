package a7;

// Spitalul dorește să testeze punerea la dispoziție a rezultatelor prin intermediul platformei online ci nu doar printat. Există însă riscul să se revină la forma inițială de punere la dispoziția pacienților a rezultatelor. Se dorește adăugarea acestei noi funcționalități pentru sistemul software, care să permită revenirea la situația inițială.

// => Decorator

public class Main {

	public static void main(String[] args) {
		IRezultat rezultat = new Rezultat();
		rezultat.acordaRezultat();
		
		System.out.println();
		
		IRezultat rezultatDecorat = new RezultatDecorator(rezultat);
		rezultatDecorat.acordaRezultat();
	}

}
