package b16;

public abstract class Notificator {
	protected Notificator nextNotificator;
	
	public Notificator(Notificator next) {
		this.nextNotificator = next;
	}

	public Notificator getNextNotificator() {
		return nextNotificator;
	}

	public void setNextNotificator(Notificator nextNotificator) {
		this.nextNotificator = nextNotificator;
	}
	
	public abstract void notify(Client client, String message);
}
