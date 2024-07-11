package arraysPro;

public class AddCharDgt {

	public static void main(String[] args) 
	{
		char arr[]= {'3','A','1','K','7','I','9','U'};
		  int sm=0;
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>='0' && arr[i]<='9')
			   {
				   sm=sm+(arr[i]-'0');
			   }
		   }
		   System.out.println(sm);

	}

}
