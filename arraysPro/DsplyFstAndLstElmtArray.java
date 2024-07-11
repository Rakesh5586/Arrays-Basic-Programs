package arraysPro;

public class DsplyFstAndLstElmtArray {

	public static void main(String[] args) 
	{
		int arr[] = {4,6,5,3,8};
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || i==arr.length-1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
