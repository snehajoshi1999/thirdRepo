package Arrays;

public class findMaxvalue {
	public static void main(String[] args) {
		
	
	
	int [] a= {2,4,1,3,5,6};
	
	int max=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);
		
}
}