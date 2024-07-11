package arraysPro;

public class RemoveElmtFrmArr {

	public static void main(String[] args) 
	{
		int arr[]= {15,18,21,32,41};
		 int d=2; //remove the element at index 2..
		 int ar[] = new int[arr.length-1];
		 for(int i=0,j=0;i<arr.length;i++)
		 {
			
			 if(i==d)
			 {
				 continue;
			 }
			
				 ar[j++]=arr[i];	 
		 }
		 System.out.println("After removing array is:");
		 for(int x : ar)
		 {
			 System.out.println(x);
		 }

	}

}
