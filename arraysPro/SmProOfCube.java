package arraysPro;
import java.util.Scanner;
public class SmProOfCube {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array");
          int n=s.nextInt();
          int arr[] = new int[n];
          int sm=0,pro=1;
          for(int i=0;i<n;i++)
          {
        	  System.out.println("enter the array elements "+i);
        	    arr[i]=s.nextInt();
          }
        	    for(int e:arr)
        	    {
        	    	sm=sm+(e*e*e);
        	    	pro=pro*(e*e*e);
        	    } 
        	      System.out.println("sum of cube of each elements are "+sm);
        	      System.out.println("product of cube of each elements are "+pro);
          }
          
	}


