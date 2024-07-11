package arraysPro;

public class CntDgitChar {

	public static void main(String[] args) 
	{
		char arr[]= {'@','A','1','K','e','I','9','U','5'};
		  int cnt=0;
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>='0' && arr[i]<='9')
			   {
				   cnt++;
			   }
		       /*
		       Using Unicode chart-- 
			   if(arr[i]>=48 && arr[i]<=57)
			   {
				   cnt++;
			   }
			   */
		   }
		   System.out.println("The count of digit character is: "+cnt);

	}

}
