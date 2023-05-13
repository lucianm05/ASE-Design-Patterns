package a15;

public class CommandTratare extends AbstractCommand {
	public CommandTratare(Pacient pacient) {
		super(pacient);
	}

	@Override
	public void execute() {
		this.pacient.trateaza();
	}

}
