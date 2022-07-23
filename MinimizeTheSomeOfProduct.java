//Author : Mr Singh
package Hexaview;
import java.util.*;

public class MinimizeTheSomeOfProduct
{	
	static void minValue(int A[],int B[],int n)
	{	int sum=0;
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0;i<n;i++)
			sum=sum+(A[i]*B[n-i-1]);
		
		System.out.println("MinValue is : "+sum);
	}
	public static void main(String[] args)
	{
		int Arr1[] = { 3, 1, 1 };
        int Arr2[] = { 6, 5, 4 };
        
        int n=Arr1.length;
        minValue(Arr1,Arr2,n);
	}
}
//***** Author : Mr.Singh *****
