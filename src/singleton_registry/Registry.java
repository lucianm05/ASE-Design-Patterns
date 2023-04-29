package singleton_registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private static Map<String, Supa> collection = new HashMap();
	
	private Registry() {}
	
	public static void register(String nume, Supa supa) throws Exception {
		if(collection.containsKey(nume)) throw new Exception("Cheia " + nume + " este deja inregistrata.");
		
		collection.put(nume, supa);
	}
	
	public static Supa get(String nume) {
		return collection.get(nume);
	}
}
