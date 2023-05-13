package a15;

public abstract class AbstractCommand implements Command {
	protected Pacient pacient;
	
	public AbstractCommand(Pacient pacient) {
		this.pacient = pacient;
	}
}
