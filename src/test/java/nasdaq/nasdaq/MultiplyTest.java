package nasdaq.nasdaq;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testmultiply() 
	{
		Concate c = new Concate();
		int result = c.multiplication(8, 7);
		assertEquals(56, result);
	}

}
