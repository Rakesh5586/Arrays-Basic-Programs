package arraysPro;

public class MakingOdToEvElmt {

	public static void main(String[] args) 
	{
		int ar[]= {15,18,21,32,41};
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]%2!=0)
        	{
        		ar[i]=ar[i]+1;
        	}
        }
        System.out.println("Array after converting into even: ");
        for(int x:ar)
        {
        	System.out.println(x+" ");
        }
	}

}
