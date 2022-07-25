//Author : Mr. Singh

public class IfArrayAlreadySorted 
{	static int arraySorted(int A[],int n)
	{
		for(int i=0,j=1;i<n-1;i++,j++)
		{
			if(A[i]>A[j])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {

		int A[]= {10,0,30,40,50};
		int size=A.length;
		
		if(arraySorted(A,size)==1)
			System.out.println("Array Is Sorted...!");

		else
			System.out.println("Array Is Not Sorted...!");
	}

}
