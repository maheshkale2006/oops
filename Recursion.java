import java.util.Scanner;
class Recursion
{
   /* static int factorial(int n)
    {
        if(n==1)
        {
            return 1; 
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=in.nextInt();
        System.out.println(factorial(n));
    } */
public static int fact(int n)
{
	int total=1;
	if(n>=1)
	{

		total=n*fact(n-1);
	}
return total;
}
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	Recursion f=new Recursion();
	int n;
	System.out.println("enter the number:");
	n=in.nextInt();
	System.out.println("factorialof Given number is:"+f.fact(n));
	
        
}
}