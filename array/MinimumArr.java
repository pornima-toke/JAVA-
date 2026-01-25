//Minimum element
public class MinimumArr
{
   public static void main(String x[])
   {
    int a[] = {3,7,2,9,5};
	int min = a[0];
for(int i=1;i<a.length;i++){
    if(a[i] < min)
        min = a[i];
}
	
   }
}
