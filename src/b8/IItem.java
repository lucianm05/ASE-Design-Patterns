package b8;

public interface IItem {
	void addNode(IItem item) throws Error;
	void removeNode(IItem item) throws Error;
	IItem getNode(int index) throws Error;
	void descriere();
}
