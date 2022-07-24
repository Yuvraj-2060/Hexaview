// Author : Mr Singh

public class OccurenceOfDigit 
{	public static void main(String[] args)
	{	int cnt=0;
		int n=25,d=2;
		
		for(int i=d;i<=n;i++)
		{
			int num=i;
			while(num!=0)
			{
				int rem=num%10;
				num/=10;
				
				if(rem==d)	cnt++;
			}
		}
		System.out.println("Occurence of "+d+" upto digit "+n+" is : "+cnt);
		
	}

}
