package nasdaq.nasdaq;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatnateTest {

	@Test
	public void testconcate()
	{
		Concate c= new Concate();
		String result= c.concatenate("shanno","devi");
		assertEquals("shannodevi", result);	
	}

}
