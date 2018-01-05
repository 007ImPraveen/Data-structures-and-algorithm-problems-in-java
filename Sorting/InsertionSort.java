class InsertionSort
{
  public static void Sort(int[] arr)
  {
    int size = arr.length;
    int j,key;
    for(int i = 1; i < size; i++)
    {
      key = arr[i];       // moving the values backwards will erase the value arr[i], so store it in key 
      j = i-1; 
      while (j >=0 && arr[j] > key)
      {
        arr[j+1] = arr[j];  // move the value backwards to make space for the key 
        j--;
      }
      arr[j+1] = key;      // insert the key in the correct position 


    }

  }
  public static void main(String[] args)
  {
    int[] arr = {
      9,7,6,15,5,10,11
    };
    Sort(arr);
    for(int i : arr )
    {
      System.out.println(i);
    }
  }
}