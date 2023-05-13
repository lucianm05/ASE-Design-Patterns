package a11;

public class Pacient {
	private String name;
	private Strategy paymentStrategy;
	
	public Pacient(String name) {
		this.name = name;
	}
	
	public Pacient(String name, Strategy paymentStrategy) {
		super();
		this.name = name;
		this.paymentStrategy = paymentStrategy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Strategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(Strategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void pay() {
		System.out.println();
		
		if(this.paymentStrategy == null) {
			System.out.println(this.name + " nu a ales inca metoda de plata");
			return;
		}
		
		System.out.println(this.name + " este in curs de plata...");
		this.paymentStrategy.pay();
	}
}
