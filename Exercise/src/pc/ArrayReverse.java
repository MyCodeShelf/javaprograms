package pc;

public class ArrayReverse {
public void reverseArray(int arr[])
{ 
int length=arr.length;
int index=length-1;
for(int i=0;i<length/2;i++)
{
	int temp=arr[i];
	arr[i]=arr[index];
	arr[index]=temp;
	index--;
}
for(int i=0;i<length-1;i++)
	System.out.print(arr[i]+"  ");
}
}
