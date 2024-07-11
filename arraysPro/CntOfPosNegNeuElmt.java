package arraysPro;

public class CntOfPosNegNeuElmt {

	public static void main(String[] args) 
	{
		int arr[]= {5,-8,0,-3,0,9,0,2,-4,5};
		int cnt=0,cnt1=0,cnt2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				cnt++;
			}
			else if(arr[i]<0)
			{
				cnt1++;
			}
			else if(arr[i]==0)
			{
				cnt2++;
			}
		}
		System.out.println("coun of positive number "+cnt);
		System.out.println("count of negative number "+cnt1);
		System.out.println("count of neutral number "+cnt2);

	}

}
