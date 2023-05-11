package b10;

public class Client implements Flyweight {
	private String name;
	private String phone;
	private String email;
	
	public Client(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public void rezerva(Rezervare rezervare) {
		System.out.println(this.toString() + " a creat " + rezervare.toString());
	}
	
	@Override
	public String toString() {
		return "Client - Nume = " + this.name +
				", Telefon = " + this.phone + 
				", Email = " + this.email;
	}
}
