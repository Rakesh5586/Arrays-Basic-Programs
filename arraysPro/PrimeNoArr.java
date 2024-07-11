package arraysPro;

public class PrimeNoArr {

	public static void main(String[] args) 
	{
		int arr[]= {5,4,8,9,7,3};
		for(int e:arr)
		{
			int p=0;
			for(int i=2;i<e;i++)
			{
				if(e%i==0)
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
				System.out.println("prime numbers are "+e);
			}
			else
			{
				System.out.println("non prime number "+e);
			}
		}
	}

}
