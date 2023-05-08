package b5;

import b5.bar.ISoftBar;
import b5.bar.SoftBar;
import b5.bucatarie.ISoftBucatarie;
import b5.bucatarie.SoftBucatarie;

// Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este compatibil cu softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era compatibil deoarece au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar prin care noul soft să poată fi folosit cu softul existent, fără a se modifica codul din vreo aplicație.

// => Adapter

public class Main {

	public static void main(String[] args) {
		ISoftBucatarie softBucatarie = new SoftBucatarie();
		ISoftBar softBar = new SoftBar();
		ISoftBucatarie adapterSoft = new AdapterSoft(softBar);
		
		softBucatarie.printareBucatarie();
		softBar.printareBar();
		adapterSoft.printareBucatarie();
	}

}
