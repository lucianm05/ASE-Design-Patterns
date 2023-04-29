package singleton_registry;

public class main {

	public static void main(String[] args) {
		try {
			Registry.register("ciuperci", new SupaCiuperci());
			Registry.register("vita", new SupaVita());
			Registry.register("legume", new SupaLegume());
			
			Registry.get("ciuperci").descriere();
			Registry.get("vita").descriere();
			Registry.get("legume").descriere();
			
			Registry.register("legume", null);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
