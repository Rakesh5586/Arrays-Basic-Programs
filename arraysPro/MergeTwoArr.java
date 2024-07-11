package arraysPro;

public class MergeTwoArr {

	public static void main(String[] args) 
	{
		int arr[]= {1,4,8};
		int arr1[]= {9,7,3};
		int arr2[] = new int[arr.length+arr1.length];
		  System.out.println("array before merge");
		  for(int e:arr2)
		  {
			  System.out.print(e+" ");
		  }
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr2[arr.length+i]=arr1[i];
		}
		System.out.println("\nafter merging array is");
		for(int e:arr2)
		{
			System.out.print( e+" ");
		}
	}

}
