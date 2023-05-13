package b16;

public class NotificatorSMS extends Notificator {

	public NotificatorSMS(Notificator next) {
		super(next);
	}

	@Override
	public void notify(Client client, String message) {
		if(client.getPhone() == null) {
			this.nextNotificator.notify(client, message);
			return;
		}
		
		System.out.println("Clientul a fost notificat la numarul " + client.getPhone());
	}

}
