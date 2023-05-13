package a15;

public class CommandInternare extends AbstractCommand {
	public CommandInternare(Pacient pacient) {
		super(pacient);
	}

	@Override
	public void execute() {
		this.pacient.interneaza();
	}
	
}
