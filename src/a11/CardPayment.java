package a11;

public class CardPayment implements Strategy {
	@Override
	public void pay() {
		System.out.println("Se realizeaza plata cu cardul");
	}

}
