
import java.util.Scanner;

public class fahrenheitTocelcelcius
{
    public static void main(String[] args)
    {
        double a;
        double b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the temperature in fahrenheit:");
        a=in.nextDouble();//9/5*c+32
        b=((a-32)*9)/5;
        System.out.println("conversion of fahrenheit to celcius is :"+b);
    }


}