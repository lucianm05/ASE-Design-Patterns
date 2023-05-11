package b8;

public abstract class AItem implements IItem {
	protected String nume;
	
	public AItem(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void addNode(IItem item) throws Error {
		throw new Error("Nu este implementata");
	}

	@Override
	public void removeNode(IItem item) throws Error {
		throw new Error("Nu este implementata");
	}

	@Override
	public IItem getNode(int index) throws Error {
		throw new Error("Nu este implementata");
	}

	@Override
	public void descriere() {
		System.out.println("AItem: " + this.nume);
	}
}
