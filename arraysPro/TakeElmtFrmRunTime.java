package arraysPro;
import java.util.Scanner;
public class TakeElmtFrmRunTime {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the array elements "+i);
			 arr[i]=s.nextInt();
		}
		System.out.println("the array elements are");
		for(int e:arr)
		{
			System.out.print(e+" ");
		}

	}

}
