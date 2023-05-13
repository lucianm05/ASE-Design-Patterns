package a14;

public abstract class Template {
	protected int pacientCode;
	
	public Template(int pacientCode) {
		this.pacientCode = pacientCode;
	}
	
	public abstract void analyzeSeverity(int code);
	
	public abstract void verifyAvailability(int code);
	
	public abstract void issueForm(int code);
	
	public final void hospitalize() {
		analyzeSeverity(pacientCode);
		verifyAvailability(pacientCode);
		issueForm(pacientCode);
	}
}
