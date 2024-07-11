package arraysPro;
import java.util.Scanner;
public class MissngElmtInRnge {

	public static void main(String[] args) 
	{
	// User Defined Array--
		Scanner s=new Scanner(System.in);
	     System.out.println("enter the size of array");
	     int n = s.nextInt();
	     int arr[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("enter the array element"+i);
	    	   arr[i]=s.nextInt();
	    }
	    for(int e:arr)
	    {
	    	System.out.print(e+" ");
	    }
	    System.out.println("\nMissing elements are:");
	    
	   for(int j=1;j<=10;j++)
	   {
		   int p=0;
		   for(int k=0;k<arr.length;k++)
		   {
			   if(arr[k]==j)
			   {
				   p=1;
				   break;
			   }
		   }
		   if(p==0)
		   {
			  System.out.println(j+" ");
		   }
				   
	   }
   //Pre defined ARRAY---
		int ar[]= {1,2,4,7,9,6};
		 for(int i=1;i<=10;i++)
		 {
			 int p=0;
			 for(int j=0;j<ar.length;j++)
			 {
				 if(ar[j]==i)
				 {
					p=1;
					break;
				 }
			  }
			 if(p==0)
			 {
				 System.out.println(i);
			 }
			 
		 }
	}

}
