package arraysPro;

public class CntNumOfVowel {

	public static void main(String[] args) 
	{
	  char arr[]= {'@','A','1','K','e','I','9','U',};
	  int cnt=0;
	   for(int i=0;i<arr.length;i++)
	   {
		  if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'
			 ||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
		  {
			  cnt++;
		  }
	   }
	   System.out.println("the number of vowels is "+cnt);

	}

}
