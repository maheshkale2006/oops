import java.util.Scanner;
class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbr");
        int num=s.nextInt();
        int count=0;
        if(num==1)
        {
            System.out.println("1 is not prime number");
        }
        else
        {
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    count=1;
                    break;
                }
            }
        }
        if(count==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
}}
}
