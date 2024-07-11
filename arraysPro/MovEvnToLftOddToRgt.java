package arraysPro;

public class MovEvnToLftOddToRgt {

	public static void main(String[] args) 
	{
	  int arr[]= {5,3,6,8,4,9,7,2};
	  int er[]= new int[arr.length];
	  int or[]= new int[arr.length];
	  int e=0,d=0;
	  for(int x:arr)
	  {
		  if(x%2==0)
		  {
			  er[e++]=x;
		  }
		  else
		  {
			  or[d++]=x;
		  }
	  }
		  int mar[]= new int[er.length+ or.length];
		  {
			  for(int i=0;i<er.length;i++)
			  {
				  mar[i]=er[i];
			  }
			  for(int i=0;i<or.length;i++)
			  {
				  mar[er.length+i]=or[i];
			  }
		  }
		  System.out.println("The final array is:");
		  for(int a:mar)
		  {
			  if(a!=0)
			  System.out.print(a+" ");
		  }
	  }
	
}

