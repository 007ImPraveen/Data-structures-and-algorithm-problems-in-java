class SumArray 
{
  public static int FindSum(int arr[])
  {
    int sum=0;
    for(int i: arr)
    {
      sum+=i;
    }
    return sum; 
  }
  public static void main(String[] args)
  {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(FindSum(arr));

  }
}