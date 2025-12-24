public class Col1
{
	public static void main(String x[])
	{
		Object obj[] = new Object[5];
		obj [0] = 100;
		obj [1] = 5.4f;
		obj [2] = false;
		obj [3] = new java.util.Date();
		obj [4] = "good";
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
	}
}