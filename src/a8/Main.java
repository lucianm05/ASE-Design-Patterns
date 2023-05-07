package a8;

// Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze modulul care permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

// => Composite

public class Main {

	public static void main(String[] args) {
		IDepartament departament1 = new Departament("Departament 1");
		IDepartament sectie1 = new Sectie("Sectia 1");
		IDepartament sectie2 = new Sectie("Sectia 2");
		IDepartament sectie3 = new Sectie("Sectia 3");
		
		IDepartament departament2 = new Departament("Departament 2");
		
		try {
			departament1.addNode(sectie1);
			departament1.addNode(sectie2);
			departament1.addNode(sectie3);
			
			departament1.descriere();
			
			System.out.println();
			
			departament2.descriere();
			
			System.out.println();
			
			departament1.getNod(0).descriere();
			
			sectie1.addNode(sectie2);
			
			System.out.println();
			
			sectie1.descriere();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
