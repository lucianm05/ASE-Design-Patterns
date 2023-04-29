package b4;

public class Client implements IClient {
	private int id;
	private String nume;
	private String email;
	
	public Client() {
		super();
	}

	public Client(int id, String nume, String email) {
		super();
		this.id = id;
		this.nume = nume;
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public IClient copiaza() {
		Client client = new Client();
		client.setId(id);
		client.setNume(new String(nume));
		client.setEmail(new String(email));
		return client;
	}

	@Override
	public void descriere() {
		System.out.println("Clientul cu id-ul " + id + " se numeste " + nume + ", email " + email );
	}
	
	
}
