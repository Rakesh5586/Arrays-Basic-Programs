package arraysPro;

public class DuplicteElmt {

	public static void main(String[] args) 
	{
		int arr[]= {4,8,9,8,4,7,2,7,0,6};
		System.out.println("The duplicate elements are: ");
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 System.out.print(arr[i]+" ");
				 }
			 }
		 }

	}

}
