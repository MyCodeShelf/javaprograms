package pc;

public class ArrayWork {

int arr[]= {2,4,2,2,3,2};
//int temp[]=new int[arr.length];
int length=arr.length;
boolean isUnique=true ;
public void sort(int[] arr)
{
for(int i=0;i<length-1;i++)
{
	for(int j=i+1;j<length;j++)
	{
		if(arr[i]==arr[j])
		{
			//isUnique=false;
			arr[j]=arr[length-1];
			length--;
			j--;
			
		}
		
}
	
}
for(int i=0 ; i< length;i++)
System.out.println(arr[i]);
}}
