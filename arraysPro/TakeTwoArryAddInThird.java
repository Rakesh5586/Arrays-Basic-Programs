package arraysPro;

public class TakeTwoArryAddInThird {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,6};
		int arr1[]= {3,5,6,1};
		int arr2[]= new int[4];
	     
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i]+arr1[i];
		}
	    for(int e:arr2)
	    {
	    	System.out.print(e+" ");
	    }

	}

}
