package head;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogicTest {
	private static Logic logic = new Logic();
	private static CellArray c_1 = new CellArray(100, 100);
	private static CellArray c_2 = new CellArray(100, 100);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c_1.setcell(1, 1, 1);
		c_1.setcell(2, 1, 1);
		c_1.setcell(1, 2, 1);
		c_1.setcell(2, 2, 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test(timeout=1000)
	public void testCount() {
		assertEquals(3,logic.count(1, 1, c_1));
		assertEquals(3,logic.count(2, 1, c_1));
		assertEquals(3,logic.count(1, 2, c_1));
		assertEquals(3,logic.count(2, 2, c_1));
	}

	@Test
	public void testJudge() {
		c_1=logic.judge(c_1);
		c_2=logic.judge(c_2);
		assertEquals(1,c_1.getcell(1,1));
		assertEquals(1,c_1.getcell(2,1));
		assertEquals(1,c_1.getcell(1,2));
		assertEquals(1,c_1.getcell(2,2));
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				assertEquals(0,c_2.getcell(i, j));
			}
		}

	}

}
