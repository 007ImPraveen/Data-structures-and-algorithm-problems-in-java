public class SequentialSearch
{
	public static int FindElement(int[] arr,int value)
	{
		int found=-1;
		for(int i: arr)
		{
			if (i==value)
			{
				found=i;
				break;
			}

		}
		return found;

	}
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8};
    int index; 
    index =FindElement(arr,9);
		System.out.println(index==-1? "Not found" : "found at " + index );

	}
}