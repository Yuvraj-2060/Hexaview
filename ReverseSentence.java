//Author : Mr Singh
package Hexaview;
public class ReverseSentence {
	public static void main(String[] args)
	{	String str="Mr Singh is here";
		str=str+" ";
		String rev="",word="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
				word=word+ch;
			else
			{
				rev=word+" "+rev;
				word="";			//again assign empty value to word for next iteration
			}
				
		}
		System.out.println("Reverse Sentence is : "+rev);
		
	}

}
