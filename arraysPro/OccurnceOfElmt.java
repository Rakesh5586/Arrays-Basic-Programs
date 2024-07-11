package arraysPro;

public class OccurnceOfElmt 
{
	public static void main(String[] args) 
	{
		int arr[]= {4,8,9,4,4,7,2,1,0,6};
		int search=4, cnt=0;
		  for(int i=0;i<arr.length;i++)
		  {
			  	if(arr[i]==search)
               {
	               cnt++;
		       }
		   }  
		  System.out.println("the element "+search+" will appear "+cnt+" times");
	  }
}


