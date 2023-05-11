package b8;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends AItem implements IItem  {
	private List<IItem> items;

	public Sectiune(String nume) {
		super(nume);
		this.items = new ArrayList<IItem>();
	}

	@Override
	public void addNode(IItem item) throws Error {
		this.items.add(item);
	}

	@Override
	public void removeNode(IItem item) throws Error {
		this.items.remove(item);
	}

	@Override
	public IItem getNode(int index) throws Error {
		return this.items.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Sectiune: " + this.nume);
		
		for(int i = 0; i < this.items.size(); i++) {
			this.getNode(i).descriere();
		}
	}

}
