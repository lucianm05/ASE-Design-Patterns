package a11;

public class CashPayment implements Strategy {

	@Override
	public void pay() {
		System.out.println("Se realizeaza plata cash");
	}
	
}
