package a4;

//Spitalul are în dotare și un laborator în care mai mulți chimiști produc diferite rețete pentru medicamente. În momentul în care o rețetă este produsă trebuie ținut cont de cantitățile din soluțiile care sunt folosite. Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor medicamente fără a se trece prin procesul de creare al rețetei. Să se implementeze modulul care facilitează crearea de noi obiecte de rețete fără a fi nevoie de apelul constructorului.
// => Prototype

public class main {
	
	public static void main(String[] args) {
		IReteta reteta1 = new Reteta("algocalmin", 50);
		IReteta reteta2 = reteta1.copiaza();
		
		reteta1.descriere();
		reteta2.descriere();
	}
}
