package memento;

public class Main {
	public static void main(String[] args) {
		Bilet bilet = new Bilet(100);
		MementoManager manager = new MementoManager();
		
		bilet.descriere();
		manager.addMemento(bilet.saveMemento());
		
		bilet.setPret(150);
		bilet.descriere();	
		manager.addMemento(bilet.saveMemento());
		
		bilet.setPret(200);
		bilet.descriere();
		manager.addMemento(bilet.saveMemento());
		
		bilet.restoreMemento(manager.getMemento(1));
		bilet.descriere();
		
		bilet.restoreMemento(manager.getLastMemento());
		bilet.descriere();
		
	}
}
