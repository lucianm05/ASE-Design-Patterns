package b16;

public class NotificatorEmail extends Notificator {
	public NotificatorEmail(Notificator next) {
		super(next);
	}

	@Override
	public void notify(Client client, String message) {
		if(client.getEmail() == null) {
			this.nextNotificator.notify(client, message);
			return;
		}
		
		System.out.println("Clientul a fost notificat la adresa " + client.getEmail());
	}

}
