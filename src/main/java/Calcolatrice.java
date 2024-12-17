
public class Calcolatrice 
{
	public double somma(double...addendi)
	{
		double s=0;
		for(double addendo:addendi)
		{
			s=s+addendo;
		}
		return s;
	}
	public double sottrazione(double n1, double n2)
	{
		double ris;
		ris = n1-n2;
		return ris;
	}
//	public double sott(double...addendi)
//	{
//		double s=0;
//		for(double addendo:addendi)
//		{
//			s=addendo-s;
//		}
//		return s;
//	}
	public double moltiplicazione(double...moltiplicandi)
	{
		double s=1;
		for(double moltiplicando:moltiplicandi)
		{
			s=s*moltiplicando;
		}
		return s;
	}
	
	public double divisione(double divisore, double dividendo) throws Exception
	{
		double ris;
		ris = divisore/dividendo;
		if(dividendo==0)
		{
			throw new Exception();
		}
		return ris;
	}
}
