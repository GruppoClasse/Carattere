package CarattereClasses;

public abstract class CarattereAbstract {
	Carattere[] listaCaratteri;
	String alfabeto;

	public CarattereAbstract(String listaCaratteri) {
		alfabeto = listaCaratteri;

		this.listaCaratteri = new Carattere[listaCaratteri.length()];
		for (int i = 0; i < listaCaratteri.length(); i++) {
			Carattere carattere = new Carattere();
			carattere.setLettera(listaCaratteri.charAt(i));
			this.listaCaratteri[i] = carattere;
		}
	}

	public void stampaLista() {
		for (int i = 0; i < listaCaratteri.length; i++) {
			System.out.print(listaCaratteri[i].getLettera());
			System.out.println(listaCaratteri[i].getOccorrenze());
		}
	}

	public Carattere[] getLista() {
		return listaCaratteri;
	}

	public void occorrenza(String parola) {
		for (int i = 0; i < parola.length(); i++) {
			char lettera = parola.charAt(i);
			int indiceLettera = alfabeto.indexOf(lettera);
			if (indiceLettera != -1) {
				System.out.println("siamo passati");
				Carattere c = listaCaratteri[indiceLettera];
				c.occorrenze++;
			}

		}

	}
}
