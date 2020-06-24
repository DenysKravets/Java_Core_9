package ua.lviv.lgs;

public class Methods 
{
	static void check(double a, double b) throws IllegalAccessException, MyException
	{
		if(a < 0 && b < 0)
		{
			throw new IllegalArgumentException();
		}
		if((a==0 && b!=0) || (a!=0 && b==0))
		{
			throw new ArithmeticException();
		}
		if(a==0 && b==0)
		{
			throw new IllegalAccessException();
		}
		if(a>0 && b>0)
		{
			throw new MyException();
		}
	}
	
	static double add(double a, double b) throws IllegalAccessException, MyException
	{
		check(a, b);
		return a + b;
	}
	
	static double subtract(double a, double b) throws IllegalAccessException, MyException
	{
		check(a, b);
		return a - b;
	}
	
	static double multiply(double a, double b) throws IllegalAccessException, MyException
	{
		check(a, b);
		return a * b;
	}
	
	static double divide(double a, double b) throws IllegalAccessException, MyException
	{
		check(a, b);
		return a / b;
	}
}
