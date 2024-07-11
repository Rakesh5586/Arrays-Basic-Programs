package arraysPro;

public class CntOfLwrCseChar {

	public static void main(String[] args) 
	{
		char arr[]= {'@','A','1','K','e','I','9','U','f'};
		   int cnt=0;
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>='a' && arr[i]<='z')
			   {
				   cnt++;
			   }
			   /*
		       Using Unicode chart-- 
			   if(arr[i]>=97 && arr[i]<=122)
			   {
				   cnt++;
			   }
			   */
		   }
		   System.out.println("The count of lowercase character is: "+cnt);

	}

}
