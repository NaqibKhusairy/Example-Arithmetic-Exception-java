/*
Question 3
Name : Putera Naqib Khusairi Bin Asri
Registration No : 10DDT21F1021
*/
class MainExe									 //mainExe class
{
	public static void main (String args[])		//main method
	{
		try										//try
		{
			int calc = 7/0;						//variable calc = 7/0
		}
		catch(ArithmeticException e)			//catch
		{
			System.out.println("error");		//print error
		}
	}
}


