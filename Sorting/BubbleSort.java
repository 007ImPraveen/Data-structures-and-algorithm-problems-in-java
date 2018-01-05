class BubbleSort{
  private static void BubbleSortBrute(int[] arr)
  {
    int size = arr.length; 
    for(int i = 0; i < size; i++)
    {
      for (int j = 0 ; j < size-i-1; j++)
      {                                            //-i ,because upto i are already sorted, -1 to avoid range error 
        if (arr[j] > arr[j+1])
        {

          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }
      }
    }
    for(int i : arr)
    {
      System.out.println(i);
    }

  }

  private static void BubbleSortOptimized(int[] arr)
  {
    int size = arr.length;
    boolean swapped; 
    for(int i = 0; i < size; i++)
    {
      swapped = false; 
      for(int j = 0; j < size-i-1; j++)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true ;
        }
      }
      if (swapped == false )
      {                           //if no swap, then the arr is already sorted, so just break the loop.
        break;
      }
    }
    for(int i : arr)
    {
      System.out.println(i);
    }

  }




  public static void main(String[] args)
  {
    int[] arr = {
      7,6,5,4,3,2,1
    };
    BubbleSortBrute(arr);
    int[] arr1= {
      1,2,3,4,5,6,7
    };
    BubbleSortOptimized(arr1);
  }
}