package testCarattere;
import CarattereClasses.*;
import static org.junit.Test.*;

import org.junit.Test;

class CASA {

	@Test
	public void test() {
		Search s = new Search("ciao", "vocali", '*');
		
		s.found();
		assert(true);
	}

}
