package arraysPro;

public class SortArray {

	public static void main(String[] args) 
	{
		int arr[]= {1,4,8,9,7,3};
		int temp;
		System.out.println("before sorting array");
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		System.out.println("\narray after sorting in asending order");
		for(int e:arr)
		{
			System.out.print(e+" ");
		}

	}

}
