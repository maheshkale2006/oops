import java.util.Scanner;
class Sumeo
{
	public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n;
	System.out.print("enter the  value of n");
	n=in.nextInt();
int i,so=0,se=0;
for(i=0;i<=n;i++)
{
	if(i%2==0)
{
	se=se+i;
}
else
{
	so=so+i;
}
}
System.out.println("sum of even number is:"+se);
System.out.println("sum of even number is:"+so);


}
}