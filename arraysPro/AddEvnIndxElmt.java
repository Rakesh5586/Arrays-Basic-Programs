package arraysPro;

public class AddEvnIndxElmt {

	public static void main(String[] args) 
	{
		int arr[] = {5,9,2,3,4,8,7};
		int sm=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				sm=sm+arr[i];
			}
		}
		System.out.println("The addition of even index is "+sm);

	}

}
