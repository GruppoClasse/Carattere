package CarattereClasses;

public abstract class CarattereAbstract {

	
	public Carattere[] createConfArray(String s) {
		Carattere[] conf = new Carattere[s.length()];
		for(int i = 0; i < conf.length; i++) {
			conf[i] = new Carattere(s.charAt(i));
		}

		return conf;
	}
	
	public String stampaLista(Carattere[] c) {
		String a = "";
		for (int i = 0; i < c.length; i++) {
			a += c[i].toString() + "\n";
		}
		return a;
	}

	public  Carattere[] occorrenza(String parola, Carattere[] conf) {
		for(int i = 0; i < parola.length(); i++) {
			for(int j = 0; j < conf.length; j++) {
				if(parola.charAt(i) == conf[j].getLettera()) {
					conf[j].trueSetOccorrenze();
				}
			}
		}
		return conf;
	}
}
