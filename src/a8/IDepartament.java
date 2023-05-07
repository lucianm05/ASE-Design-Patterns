package a8;

public interface IDepartament {
	void removeNode(IDepartament departament) throws Error;
	void addNode(IDepartament departament) throws Error;
	IDepartament getNod(int index) throws Error;
	void descriere();
}
