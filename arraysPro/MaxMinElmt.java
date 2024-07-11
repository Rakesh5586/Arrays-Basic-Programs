package arraysPro;

public class MaxMinElmt {

	public static void main(String[] args) 
	{
		int arr[]= {3,2,8,6,9};
		  int max=arr[0],min=arr[0];
		  for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>max)
			   {
				   max=arr[i];
			   }
			   else if(arr[i]<min)
			   {
				   min=arr[i];
			   }
		   }
		   System.out.println(max+" "+min);
		   
		   
    //Using ForEach loop--
		   
		   
		   for(int e:arr)
		   {
			   if(e>max)
			   {
				   max=e;
			   }
			   else if(e<min)
			   {
				   min=e;
			   }
			  
		   }
		   System.out.println(max+" "+min);
	}

}
