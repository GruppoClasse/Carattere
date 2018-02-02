package CarattereClasses;

public class Search extends CarattereAbstract implements Constant{
	String s, conf; 
	char o;
	
	public Search(String s, String conf, char o) {
		this.s = s;
		this.conf = conf;
		this.o = o;
	}
	
	
	public String found() {
		String  a = "";
		switch(this.conf) {
			case "vocale":
				a = stampaLista(occorrenza(this.s, createConfArray(this.VOCALE)));
				break;
			case "consonante":
				a = stampaLista(occorrenza(this.s, createConfArray(this.CONSONANTE)));
				break;
			case "tutte":
				a = stampaLista(occorrenza(this.s, createConfArray(this.LETTERE)));
				break;
		}
		return a;
	}
}
