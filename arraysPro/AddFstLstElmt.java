package arraysPro;

public class AddFstLstElmt {

	public static void main(String[] args) 
	{
		int arr[] = {5,4,7,6,8};
		int sm=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || i==arr.length-1)
			{
				sm=sm+arr[i];
			}
		}
		System.out.println(sm);

	}

}
