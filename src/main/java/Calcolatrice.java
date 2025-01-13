
public class Calcolatrice 
{
	public double somma(double...addendi)
	{
		double s=0;
		for(double addendo:addendi)
		{
			if(addendo < 0)
			{
				System.out.println("addendo negativo");
			}
			if(addendo == 0)
			{
				System.out.println("addendo : 0");
			}
			if(addendo > 0)
			{
				System.out.println("addendo è positivo");
			}
			s=s+ addendo;
		}
		return s;
	}
<<<<<<< HEAD
	
	public double differenza (double d1, double d2)
	{
		double diff=0;
		diff = d1-d2;
		return diff;
	}
=======
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
>>>>>>> caa7e3d5ec2396e6f96bf9751c43088828449cb3
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
