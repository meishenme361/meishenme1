package head;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gameMapTest {
	private static CellArray c_1 = new CellArray(100, 100);
	private static gameMap gamemap = new gameMap(c_1);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGameMap() {
		assertEquals(null, gamemap.isMap());
	}
}
