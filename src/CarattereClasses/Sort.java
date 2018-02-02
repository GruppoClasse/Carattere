package CarattereClasses;

public interface Sort{

	public default Carattere[] alphabetic(Carattere[] c){
		int i, j;
		Carattere key;
		for (i = 1; i < c.length; i++){
			key = c[i];
		       j = i-1;
		 
		       /* Move elements of arr[0..i-1], that are
		          greater than key, to one position ahead
		          of their current position */
		       while (j >= 0 && c[j].getLettera() > key.getLettera())
		       {
		           c[j+1] = c[j];
		           j = j-1;
		       }
		       c[j+1] = key;
		   } 
		return c;
		}
	
	
	public default Carattere[] numeric(Carattere[] c){
		int i, j;
		Carattere key;
		for (i = 1; i < c.length; i++){
			key = c[i];
		       j = i-1;
		 
		       /* Move elements of arr[0..i-1], that are
		          greater than key, to one position ahead
		          of their current position */
		       while (j >= 0 && c[j].getOccorrenze() > key.getOccorrenze())
		       {
		           c[j+1] = c[j];
		           j = j-1;
		       }
		       c[j+1] = key;
		   } 
		return c;
		}
}