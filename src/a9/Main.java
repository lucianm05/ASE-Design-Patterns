package a9;

// Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții doresc internarea să fie internate doar personale care au asigurare de sănătate. Sa se realizeze un nivel intermediar care sa permită internarea doar acestor persoane. 

// =>

public class Main {

	public static void main(String[] args) {
		Persoana testulescu = new Persoana("Testulescu", false);
		Persoana xulescu = new Persoana("Xulescu", true);
		
		Internare internare1 = new Internare(testulescu);
		Internare internare2 = new Internare(xulescu);
		
		internare1.interneaza();
		internare2.interneaza();
		
		ProxyInternare internareProxy1 = new ProxyInternare(internare1);
		ProxyInternare internareProxy2 = new ProxyInternare(xulescu);
		
		internareProxy1.interneaza();
		internareProxy2.interneaza();
	}

}
