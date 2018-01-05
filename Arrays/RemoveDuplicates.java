class RemoveDuplicates{
  public static int remove(int[] arr){
    int size = arr.length; 
    int j = 0;                       
    for(int i = 0;i < size;i++){
      if (arr[i] != arr[j]){                // if same value, j holds the last reference of the last unique numbers 
        j++;
        arr[j] = arr[i];
      }
    }
    return j+1;
  }

  public static void main(String[] args){
    int[] arr= {
      1,2,3,3,3,3,4
    };
    int new_size = remove(arr);
    for(int i = 0; i < new_size; i++){
      System.out.println( arr[i] );

    }

  }
}