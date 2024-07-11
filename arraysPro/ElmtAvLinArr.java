package arraysPro;

public class ElmtAvLinArr {

	public static void main(String[] args) 
	{
		int arr[]= {5,4,8,9,7};
		  int search = 3;
		  int el=0,i;
		  for( i=0;i<arr.length;i++)
		  {
			  if(arr[i]==search)
			  {
				  el=1;
				  break;
			  }
		  }
         if(el==1)
         {
        	 System.out.println("element available at "+i);
         }
         else
         {
        	 System.out.println("element not found in array");
         }
		  
	}

}
