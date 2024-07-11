package arraysPro;

public class GetFstOddValue {

	public static void main(String[] args) 
	{
		int arr[] = {4,5,3,7,6,2};
		int fo=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				fo=arr[i];
				break;
			}
		}
		System.out.println("the first odd value is: "+fo);

	}

}
