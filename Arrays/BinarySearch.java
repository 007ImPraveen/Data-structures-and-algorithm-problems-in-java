public class BinarySearch
{
	public static int BinarySearch(int arr[],int value)
	{
		int low =0;
		int high = arr.length-1;
		int mid;

		while (low<=high)
		{
			mid = (low+high)/2;
			if (arr[mid] == value )
				return 1;
			else if(arr[mid]<value)
				low =mid+1 ;
			else if(arr[mid] >value )
				high= mid-1;

		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7};
		int value = -1;
		System.out.println(BinarySearch(arr,value)==1 ? "Found successfully " : "Not found, sorry!");
	}
}