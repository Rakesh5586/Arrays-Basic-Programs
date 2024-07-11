package arraysPro;

public class LeaderElmt {

	public static void main(String[] args) 
	{
		int arr[]= {6,7,3,4,5,2};
		int le=arr[arr.length-1];
		for(int i=arr.length-2;i>0;i--)
		{
			if(le<arr[i])
			{
				le=arr[i];
				System.out.println(le+" ");
			}
		}

	}

}
