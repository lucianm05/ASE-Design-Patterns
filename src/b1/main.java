package b1;

//Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită, etc. Să se implementeze modulul care permite realizarea de obiecte din familia supelor. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de supă să nu fie necesare modificări în codul existent.
// => Factory Method

public class main {
	public static void serveste(Factory factory) {
		Supa supa = factory.create();
		supa.descriere();
	}
	
	public static void main(String[] args) {
		serveste(new SupaCiuperciFactory());
		serveste(new SupaLegumeFactory());
		serveste(new SupaVitaFactory());
	}
}
