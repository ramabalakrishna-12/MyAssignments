package week1.day1;

public class Maths {
	
	public int add(int a, int b)
	{
		return a+b;
		
		
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths ms=new Maths();
		ms.add(1, 2);
		System.out.println("Sum is " +ms.add(8,4));
		System.out.println("Multiply is " +ms.mul(5, 4));
		System.out.println("Division is " +ms.div(100, 4));
		
		
	}

}
