package a2;

//În cadrul aplicației personalul spitalului este de mai multe tipuri. Acestea sunt salvate într-un
//enum { Brancardier, Asistent, Medic}. Să se implementeze modulul care pune la dispoziției
//crearea de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
// => Factory

public class main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital brancardier = factory.create(TipPersonalSpital.brancardier);
		PersonalSpital asistent = factory.create(TipPersonalSpital.asistent);
		PersonalSpital medic = factory.create(TipPersonalSpital.medic);
		
		brancardier.descriere();
		asistent.descriere();
		medic.descriere();
	}
}
