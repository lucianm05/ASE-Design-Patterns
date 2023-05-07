package a8;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartament {
	private String nume;
	private List<IDepartament> sectii;
	
	public Departament(String nume) {
		this.nume = nume;
		this.sectii = new ArrayList<IDepartament>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public List<IDepartament> getSectii() {
		return sectii;
	}

	public void setSectii(List<IDepartament> sectii) {
		this.sectii = sectii;
	}

	@Override
	public void removeNode(IDepartament departament) throws Error {
		this.sectii.remove(departament);
	}

	@Override
	public void addNode(IDepartament departament) throws Error {
		this.sectii.add(departament);
	}

	@Override
	public IDepartament getNod(int index) throws Error {
		return this.sectii.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Acesta este departamentul " + this.nume + " cu sectiile: ");
		
		if(this.sectii.size() == 0) {
			System.out.println("Nu are sectii");
			return;
		}
		
		for(IDepartament sectie:this.sectii) {
			sectie.descriere();
		}
	}
	
	
}
