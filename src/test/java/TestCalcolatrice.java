import org.junit.Assert;

import org.junit.Test;


class TestCalcolatrice 
{
	@Test
	void testSomma() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(5,6);
		
		Assert.assertEquals(11, res, 0);
	}
	@Test
	void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(6,6);
		
		Assert.assertEquals(11, res, 0);
	}

}
