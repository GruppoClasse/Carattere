package CarattereClasses;

public class Carattere {
	int occorrenze ;
	char lettera;
	
	public Carattere () {
		occorrenze = 0;
	}
	
	public void setLettera(char lettera) {
		this.lettera = lettera;
	}
	
	public void setOccorrenze(int occorrenze) {
		this.occorrenze = occorrenze;
	}
	
	public char getLettera() {
		return lettera;
	}
	
	public int getOccorrenze() {
		return occorrenze;
	}

}
