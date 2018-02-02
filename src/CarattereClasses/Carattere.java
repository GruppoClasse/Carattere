package CarattereClasses;

public class Carattere {
	private int occorrenze ;
	private char lettera;
	
	public Carattere (char lettera) {
		this.lettera = lettera;
	}
	
	public void setOccorrenze(int occorrenze) {
		this.occorrenze += occorrenze;
	}
	
	public char getLettera() {
		return lettera;
	}
	
	public int getOccorrenze() {
		return occorrenze;
	}
	
	public void trueSetOccorrenze() {
		this.occorrenze++;
	}
	
	public String toString() {
		return "Lettera: "+ getLettera() + " Occorenza: "+ getOccorrenze();
	}
	
	
}
