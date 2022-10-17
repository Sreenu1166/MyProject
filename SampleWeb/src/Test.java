
public class Test {
	
	public static void main(String[] args) {
		
		int ar[]= {10,5,6,7,2,4,3,1,9};
		for(int key=1;key<=10;key++)
		{
			boolean isPresent=check(ar,key);
			if(isPresent==false)
			{
				System.out.println(key);
				break;
			}
		}
	}
	private static boolean check(int ar[],int key)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	

}
