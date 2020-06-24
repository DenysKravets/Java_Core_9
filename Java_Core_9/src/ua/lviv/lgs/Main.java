package ua.lviv.lgs;

public class Main {

	public static void main(String[] args)
	{
		try
		{
			Methods.add(1, 2);
		}
		catch(MyException e)
		{
			System.out.println("MyException");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("IllegalAccessException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		finally
		{
			System.out.println("final statement");
		}
		
		try
		{
			Methods.subtract(-1, -2);
		}
		catch(MyException e)
		{
			System.out.println("MyException");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("IllegalAccessException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		finally
		{
			System.out.println("final statement");
		}
		
		try
		{
			Methods.multiply(0, 0);
		}
		catch(MyException e)
		{
			System.out.println("MyException");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("IllegalAccessException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		finally
		{
			System.out.println("final statement");
		}
		
		try
		{
			Methods.divide(0, 2);
		}
		catch(MyException e)
		{
			System.out.println("MyException");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("IllegalAccessException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		finally
		{
			System.out.println("final statement");
		}
		
		System.out.println("Program continues to work");
	}

}
