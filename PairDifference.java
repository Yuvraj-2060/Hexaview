//Author : Mr. Singh
package Hexaview;

public class PairDifference 
{	public static void pairDiff(int A[],int n,int N)
	{
		for(int i=n-1;i>0;i--)
			for(int j=i-1;j>=0;j--)
				if(	(A[i]-A[j])==N )
				{	System.out.println("Pair with Difference 78 is : ("+A[j]+","+A[i]+")");
					return;
				}
		System.out.println("No Such Pair found ...!");
	}
	public static void main(String[] args)
	{	int A[]={2,3,5,20,50,80},N=78;
		int n=A.length;
		pairDiff(A,n,N);
	}
}

//**** Author : Mr. Singh *****
