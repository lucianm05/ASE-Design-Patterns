package b6;

public class Masa {
	private int number;
	private boolean isFree;
	private boolean isCleaned;
	private boolean hasNewNapkins;
	
	public Masa(int number, boolean isFree, boolean isCleaned, boolean hasNewNapkins) {
		super();
		this.number = number;
		this.isFree = isFree;
		this.isCleaned = isCleaned;
		this.hasNewNapkins = hasNewNapkins;
	}

	public boolean isFree() {
		return isFree;
	}
	
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	
	public boolean isCleaned() {
		return isCleaned;
	}
	
	public void setCleaned(boolean isCleaned) {
		this.isCleaned = isCleaned;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isHasNewNapkins() {
		return hasNewNapkins;
	}

	public void setHasNewNapkins(boolean hasNewNapkins) {
		this.hasNewNapkins = hasNewNapkins;
	}
	
	
	
}
