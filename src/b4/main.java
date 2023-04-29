package b4;

//Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client a mai fost la restaurant și revine pentru a fi realiza o rezervare aici să nu fie necesară reconstruirea unui cont respectivului client, deoarece prin construire clientului durează foarte mult.

// => Builder

public class main {
	public static void main(String[] args) {
		IClient client = new Client(0, "Lucian", "lucianmg05@gmail.com");
		IClient client2 = client.copiaza();
		
		client.descriere();
		client2.descriere();
	}
}
