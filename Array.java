import java.util.*;
class Array
{
	public static void main(String as[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size:- ");
		int n=s.nextInt();
		int i,j;
		int a[]=new int[n];
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("enter the searching elements:- ");
		int ele=s.nextInt();
		int c=0;
		for(i=0;i<n;i++)
		{
			if(ele==a[i])
			{
				c=0;
				System.out.print(ele+" is found in the array");
				break;
			}
			else
				c++;
		}
		if(c!=0)
			System.out.print(ele+" is not found in the array");
		System.out.println("\nSorted array:");
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");;
		}
	}
}