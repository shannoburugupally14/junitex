package nasdaq.nasdaq;

import junit.framework.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class MulTest 
{
	@org.junit.Test
	public void MulTest()
	{
		Mul m= new Mul();
		 assertEquals(10,10, m.multiple(2,5));
	}
}
