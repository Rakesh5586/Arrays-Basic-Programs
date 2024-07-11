package arraysPro;

public class comonElmtFrmTwoArr {

	public static void main(String[] args) 
	{
		int ar[]= {4,5,8,9,1};
		int arr[]= {3,4,5,7,1};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(ar[i]==arr[j])
				{
					System.out.print(ar[i]+" ");
					
				}
			}
		}

	}

}
