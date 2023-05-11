package b8;

// Este dorita reprezentarea meniului in cadrul aplicației. Meniul conține secțiuni (startere, băuturi, desert, etc.) fiecare secțiune poate conține subsecțiuni (sucuri, cafea, etc) sau item-uri (, apa plata, apa minerala, etc). Sa se realizeze modulul care permite reprezentarea arborescenta a meniului restaurantului.

// => Composite

public class Main {

	public static void main(String[] args) {
		IItem sectiune = new Sectiune("Bauturi");
		IItem subsectiune1 = new Subsectiune("Cafea");
		IItem subsectiune2 = new Subsectiune("Sucuri");
		IItem item1 = new Item("Apa plata");
		IItem item2 = new Item("Apa minerala");
		sectiune.addNode(subsectiune1);
		sectiune.addNode(subsectiune2);
		sectiune.addNode(item1);
		sectiune.addNode(item2);
		
		sectiune.descriere();
		
		System.out.println();
		
		sectiune.removeNode(subsectiune1);
		sectiune.removeNode(item1);
		
		sectiune.descriere();
		
		System.out.println();
	}

}
