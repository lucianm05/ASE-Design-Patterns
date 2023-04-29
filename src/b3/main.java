package b3;

//Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită, etc. Să se implementeze modulul care permite realizarea de obiecte din familia supelor. Tipurile de supă sunt reținute în cadrul unui enum. ;ljvcvvjh

// => Builder

public class main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Supa supaC = factory.build(TipSupa.ciuperci);
		Supa supaV = factory.build(TipSupa.vita);
		Supa supaL = factory.build(TipSupa.legume);
		
		supaC.descriere();
		supaV.descriere();
		supaL.descriere();
	}
}
