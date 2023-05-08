package b6;

import java.util.List;

public class Facade {
	public Masa getTable(List<Masa> mese) {
		for(Masa masa:mese) {
			if(masa.isCleaned() && masa.isFree() && masa.isHasNewNapkins()) return masa;
		}
		
		return null;
	}
}
