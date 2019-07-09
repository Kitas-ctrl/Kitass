package COM.AMDOCS.amdocsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testSimpleAddition()
	{
		Addition testaddition = new Addition();
		
		
		double actualResult = testaddition.add(10.2,12.4);
		double expectedResult = 22.6;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
		
		actualResult = testaddition.add(100.6,2.8);
		expectedResult = 103.4;
		
		assertEquals(expectedResult, actualResult, 0.001);
	}

}
