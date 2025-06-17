import java.util.*;
public class Evencount
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]%2==0){
		        ecount+=1;
		    System.out.println("ecount");
		}
		else if(a[i]%2!=0)
		{
		    ocount+=1;
		    System.out.println("ocount");
		}
	}
}
}