package arraysPro;

public class SmOfOddEvnByForEachLoop {

	public static void main(String[] args) 
	{
		int arr[]= {3,5,2,8,6,1};
		int sm=0,pro=1;
		for(int e:arr)
		{
			if(e%2==0)
			{
				sm=sm+e;
			}
			else
			{
				pro=pro*e;
			}
		}
		System.out.println("sum of even number is "+sm);

		System.out.println("pro of odd number is "+pro);
	}

}
