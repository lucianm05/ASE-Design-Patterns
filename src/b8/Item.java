package b8;

public class Item extends AItem {
	public Item(String nume) {
		super(nume);
	}

	@Override
	public void descriere() {
		System.out.println("Item: " + this.nume);
	}
}
