package arraysPro;

public class NumOfOccLchar {

	public static void main(String[] args) 
	{
		char arr[] = {'h','e','l','l','o'};
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='l')
			{
				cnt++;
			}
		 }
		 System.out.println("Occurence of 'l' is: "+cnt);
	}

}
