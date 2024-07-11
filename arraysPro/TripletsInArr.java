package arraysPro;

public class TripletsInArr {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Triplets of sum of 10 is array elements are:");
		for(int i=0;i<ar.length-2;i++) 
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					if(ar[i]+ar[j]+ar[k]==10)
					{
						System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
					}
				}
			}
		}

	}

}
