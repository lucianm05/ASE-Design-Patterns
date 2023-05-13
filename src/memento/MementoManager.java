package memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {
	private List<MementoBilet> mementoList = new ArrayList<>();
	
	public void addMemento(MementoBilet memento) {
		this.mementoList.add(memento);
	}
	
	public MementoBilet getMemento(int index) {
		return this.mementoList.get(index);
	}
	
	public MementoBilet getLastMemento() {
		if(this.mementoList.size() == 0) {
			System.out.println("Nu exista stari salvate");
			return null;
		}
		
		int index = this.mementoList.size() - 1;
		MementoBilet memento = this.mementoList.get(index);
		this.mementoList.remove(index);
		return memento;
	}
}
