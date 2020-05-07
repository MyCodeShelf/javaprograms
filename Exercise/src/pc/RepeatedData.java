package pc;

public class RepeatedData {
public void findRepeated(String str)
{ 
	int length=str.length();
	char[] ch=new char[str.length()];
	for(int i=0;i<str.length();i++)
	{
		ch[i]=str.charAt(i);
	}
	
	for(int j=0;j<length-1;j++)
	{
		for(int k=j+1;k<length;k++)
		{
			if(ch[j]==ch[k])
				System.out.println(ch[j] + "  repeats at index" +k);
		}
	}
}
}
