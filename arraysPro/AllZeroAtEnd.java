package arraysPro;

public class AllZeroAtEnd {

	public static void main(String[] args) 
	{
		int arr[]= {5,0,6,8,0,9,7,0};
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[k++]=arr[i];
			}
		}
			while(k<arr.length)
			{
				arr[k++]=0;
			}
		System.out.println("Array after putting all zero");
		for(int e:arr)
		{
			System.out.print(e+" ");
		}

	}

}
