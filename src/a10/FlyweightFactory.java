package a10;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Pacient> pacienti;
	
	public FlyweightFactory() {
		this.pacienti = new HashMap<String, Pacient>();
	}
	
	public Pacient getPacient(String nume, String numarTelefon, String adresa) {
		String key = nume + "-" + numarTelefon + "-" + adresa;
		
		if(!this.pacienti.containsKey(key)) {
			this.pacienti.put(key, new Pacient(nume, numarTelefon, adresa));
		}
		
		return this.pacienti.get(key);
	}
}
