package b5;

import b5.bar.ISoftBar;
import b5.bucatarie.ISoftBucatarie;

public class AdapterSoft implements ISoftBucatarie {
	private ISoftBar softBar;
	
	public AdapterSoft(ISoftBar softBar) {
		this.softBar = softBar;
	}

	@Override
	public void printareBucatarie() {
		this.softBar.printareBar();
	}
	
	
}
