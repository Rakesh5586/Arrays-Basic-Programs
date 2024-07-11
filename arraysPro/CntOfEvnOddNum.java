package arraysPro;

public class CntOfEvnOddNum {

	public static void main(String[] args) 
	{
		int arr[] = {4,5,3,7,6,2};
		int cntE=0,cntO=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				cntE++;
			}
			else
			{
				cntO++;
			}
		}
		System.out.println("count of even number is:"+cntE);
		System.out.println("count of odd number is:"+cntO);
	}

}
