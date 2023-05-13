package b16;

// Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește implementarea unui modul sa notifice clienții restaurantului. Problema este că restaurantul deține pentru anumiți clienți numărul de telefon, iar pentru alți clienți doar adresa de mail. Să se implementeze funcționalitatea de a trimite notificări clienților prin SMS, iar în cazul în care pentru anumiți clienți restaurantul nu are în baza de date numărul de telefon, să se trimită notificarea prin email. În cazul clienților pentru care nu există nici numărul de telefon, nici adresa de mail, se trimite managerului restaurantului o notificare cu numele clientului pentru care nu există date de contact.

// => Chain of Responsibility

public class Main {
	public static void main(String[] args) {
		Notificator managerN = new NotificatorManager(null);
		Notificator emailN = new NotificatorEmail(managerN);
		Notificator smsN = new NotificatorSMS(emailN);
		
		smsN.notify(new Client("0723232323", "test@test.com"), "Mesaj");
		smsN.notify(new Client(null, "email@valid.com"), "Mesaj nou");
		emailN.notify(new Client(null, "client@gmail.com"), "Mesag");
		smsN.notify(new Client(null, null), "Mesaj nou nou");
	}
}
