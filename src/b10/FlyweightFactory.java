package b10;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static final Map<String, Client> flyweights = new HashMap<>();
	
	public static Client getClient(String name, String phone, String email) {
		String key = name + "-" + phone + "-" + email;
		
		if(!flyweights.containsKey(key)) {
			flyweights.put(key, new Client(name, phone, email));
		}
		
		return flyweights.get(key);
	}
}
