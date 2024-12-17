import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCalcolatrice
{
	@Test
	public void testSomma() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(5,6);
		
		assertEquals(11, res);
	}
	@Test
	public void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(6,6);
		
		assertEquals(12, res);
	}
	@Test
	public void testSommaNegativo() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(10,-5);
		
		assertEquals(5, res);
	}
	@Test
	public void testSott() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.sottrazione(5,6);
		
		assertEquals(-1, res);
	}
	@Test
	public void testSott2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.sottrazione(6,6);
		
		assertEquals(0, res);
	}
	@Test
	public void testSottNeg() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.sottrazione(-5,-3);
		
		assertEquals(-2, res);
	}
	@Test
	public void testMolt() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(5,6);
		
		assertEquals(30, res);
	}
	@Test
	public void testMolt2() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(6,6);
		
		assertEquals(36, res);
	}
	@Test
	public void testMoltNeg() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(-5,6);
		
		assertEquals(-30, res);
	}
	@Test
	public void testDiv() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(8,8);
		
		assertEquals(1, res);
	}
	@Test
	public void testDiv2() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(20,4);
		
		assertEquals(5, res);
	}
	@Test
	public void testDivNeg() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(-5,10);
		
		assertEquals(-0.5, res);
	}
	
}


