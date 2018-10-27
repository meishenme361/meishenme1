package head;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellArrayTest {

	private static CellArray cellarray = new CellArray(100, 100);
	@Before
	public void setUp() throws Exception {
		cellarray.setcell(3, 3, 1);
	}

	@Test
	public void testGetcell() {
		assertEquals(1, cellarray.getcell(3, 3));
	}

	@Test
	public void testSetcell() {
		cellarray.setcell(4, 4, 1);
		assertEquals(1, cellarray.getcell(4, 4));
	}

	@Test
	public void testIsValidCell() {
		assertEquals(0, cellarray.isValidCell(101, 101));
	}

}
