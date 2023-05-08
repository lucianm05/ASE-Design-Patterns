package b6;

import java.util.ArrayList;
import java.util.List;

// În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să verifice dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea ultimului client, de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul restaurantului dorește realizarea unui modul care să simplifice munca recepționistului și să nu mai fie nevoit să verifice în toate locurile ci doar într-un singur loc.

// => Facade

public class Main {

	public static void main(String[] args) {
		List<Masa> mese = List.of(
				new Masa(0, false, false, false),
				new Masa(1, true, false, false),
				new Masa(2, true, true, false),
				new Masa(3, true, true, true),
				new Masa(4, true, true, false)
				);
		
		Facade facade = new Facade();
		
		Masa masaLibera = facade.getTable(mese);
		
		if(masaLibera != null) {
			System.out.println("Masa " + masaLibera.getNumber() + " este libera");
		} else {
			System.out.println("Nu exista masa libera");
		}
	}

}
