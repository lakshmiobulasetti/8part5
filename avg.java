import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n;double res=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter how many numbers you have to cal avg");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter "+n+"digits ");
	for(int i=0;i<n;i++)
	a[i]=s.nextInt();
	for(int i=0;i<n;i++)
	res=res+a[i];
	System.out.println("average="+res/n);
	
	}
}
