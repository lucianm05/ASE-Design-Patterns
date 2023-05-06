package a6;

import java.util.ArrayList;
import java.util.List;

public class Spital {
	private Medic medic;
	private List<Salon> saloane;
	
	public Spital() {
		this.medic = new Medic();
		
		this.saloane = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			this.saloane.add(new Salon(i % 2 == 0, i));
		}
	}
	
	public Medic getMedic() {
		return medic;
	}
	public void setMedic(Medic medic) {
		this.medic = medic;
	}
	public List<Salon> getSaloane() {
		return saloane;
	}
	public void setSaloane(List<Salon> saloane) {
		this.saloane = saloane;
	}
	
	public Salon gasesteSalonLiber() {
		for(int i = 0; i < this.saloane.size(); i++) {
			Salon salon = this.saloane.get(i);
			
			if(salon.isArePatLiber()) return salon;
		}
		
		return null;
	}
	
	public void ocupaSalon(int index) {
		this.saloane.get(index).setArePatLiber(false);
	}
}
