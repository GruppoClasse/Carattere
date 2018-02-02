package testCarattere;
import CarattereClasses.*;
import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Vocale letteraA = new Vocale ();
	}
	
	 @org.junit.jupiter.api.Test
	 void testNumeroOccorrenze() {
		 String parola = "parola";
		 Vocale letteraA = new Vocale ();
		// assert(letteraA.ricorrenze(parola) == 2);
	 }
	 
	 @org.junit.jupiter.api.Test
	 void testRiempimentoArray() {
		 Vocale letteraA = new Vocale ();
		//letteraA.stampaLista();
		 assert(letteraA.getLista()[2].getLettera() == 'i');
	 }
	 
	 
	 @org.junit.jupiter.api.Test
	 void testOccorrenza() {
		 Vocale letteraA = new Vocale();
		 letteraA.stampaLista();
		 Vocale occorrenzaV = new Vocale();
		 occorrenzaV.occorrenza("gatto");
		 occorrenzaV.stampaLista();
	 }

	 
	 

}
