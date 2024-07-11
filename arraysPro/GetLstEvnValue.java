package arraysPro;

public class GetLstEvnValue {

	public static void main(String[] args) 
	{
		  int arr[] = {4,5,3,7,6,2};
		  int le=0;
		  for(int e:arr)
		  {
			  if(e%2==0)
			  {
				  le=e;
			  }
		  }
		  System.out.println("Last even value is: "+le);

	}

}
