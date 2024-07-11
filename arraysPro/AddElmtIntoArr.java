package arraysPro;

public class AddElmtIntoArr {

	public static void main(String[] args) 
	{
		int arr[] = {5,8,6,9,3,2};
		int el=7;    //Element to add...
		int d=3;     //Index to add...
		int ar[] = new int[arr.length+1];
      for(int i=0;i<ar.length;i++)
      {
    	  if(i<d)
    	  {
    		 ar[i]=arr[i]; 
    	  }
    	  else if(i==d)
    	  {
    		  ar[i]=el;
    	  }
    	  else if(i>d)
    	  {
    		  ar[i]=arr[i-1];
    	  }
      }
      System.out.println("After adding array is: ");
      for(int x:ar)
      {
    	  System.out.print(x+" ");
      }
	}

}
