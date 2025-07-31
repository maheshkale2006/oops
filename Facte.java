import java.util.Scanner;
public class Facte
{
    public static void main(String[] args) {
        System.out.println("enter the number which you want to calculate factorial");
        int n;
        int i;
        int fact;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n<=0)
            System.out.println("please enter the positive value.");
        else
            for(i=1;i<=n;i++)
                fact=i*fact;

    }
}