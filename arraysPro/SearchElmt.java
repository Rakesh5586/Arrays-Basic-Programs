package arraysPro;

public class SearchElmt {

	public static void main(String[] args) 
	{
		int arr[]= {4,8,3,2,1};
		int search=3;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("element found at index "+i);
			}
		}
     //Using forEach loop---
		int cnt=-1;
		for(int e:arr)
		{
			cnt++;
			if(e==search)
			{
			  System.out.println("element found at index "+cnt);
			}
		}
	}

}
