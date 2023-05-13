package a12;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject {
	private List<Observer> observers;
	
	public Spital() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void sendUpdate(String message) {
		for(Observer observer:this.observers) {
			observer.update(message);
		}
	}
	
}
