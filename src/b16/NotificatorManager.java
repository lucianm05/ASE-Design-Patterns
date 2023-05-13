package b16;

public class NotificatorManager extends Notificator {

	public NotificatorManager(Notificator next) {
		super(next);
	}

	@Override
	public void notify(Client client, String message) {
		System.out.println("Clientul nu are date de contact disponibile");
	}

}
