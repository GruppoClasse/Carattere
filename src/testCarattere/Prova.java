package testCarattere;

import static org.junit.Assert.*;

import org.junit.Test;

import CarattereClasses.Search;

public class Prova {

	@Test
	public void test() {
		Search s = new Search("ciao", "vocale", '*');
		
		System.out.print(s.found());
		assert(true);	
	}

}
