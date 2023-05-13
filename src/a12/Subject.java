package a12;

public interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void sendUpdate(String message);
}
