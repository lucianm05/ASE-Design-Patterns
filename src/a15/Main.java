package a15;

// Managerul spitalului dorește sa grăbească procesul de la primiri urgente si astfel operatorul care primește pacienții la triaj va da comenzi de internare sau de tratare imediata pentru pacienții veniți si ii va așeza astfel la alte cozi separate. Comenzile sunt trimise către medici, însă operatorul poate primească alți pacienții mult mai rapid. Sa se implementeze modulul care permite trimiterea de comenzi către medici de la operatorul de primire.

// => Command

public class Main {

	public static void main(String[] args) {
		Operator operator = new Operator();
		
		Pacient pacient1 = new Pacient("Pacient 1");
		Pacient pacient2 = new Pacient("Pacient 2");
		Pacient pacient3 = new Pacient("Pacient 3");
		
		Command commandInternare = new CommandInternare(pacient1);
		Command commandTratare = new CommandTratare(pacient2);
		Command commandInternare2 = new CommandInternare(pacient3);
		
		operator.invoke(commandInternare);
		operator.invoke(commandTratare);
		operator.invoke(commandInternare2);
	}

}
