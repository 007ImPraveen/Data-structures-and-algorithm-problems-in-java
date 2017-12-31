/* Rotating	an	Array	by	K	positions.
For	example,	an	array	[10,20,30,40,50,60]	rotate	by	2	positions	to	[30,40,50,60,10,20] */

public class RotateArrayByKpos{

  public static void rotateArray(int[] arr, int k){
    int n = arr.length;
    reverseArray(arr,0,k-1); // reverse upto k
    printArray(arr);
    reverseArray(arr,k,n-1); // reverse the remaing array;
    printArray(arr);
    reverseArray(arr,0,n-1); // now reverse the entire array to stimulate the rotate operation  
    printArray(arr);
  }

  private static void reverseArray(int[] arr, int start, int  end ){          // let's reverse the array and swap to rotate by k
    for(int i = start,j=end;i<j; i++,j--){
      int temp =arr[i];
      arr[i]= arr[j];
      arr[j]=temp;
    }
  }

  private static void printArray(int[] arr)
  {
    for (int i: arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }



  public static void main(String[] args){
    int[] arr ={
      1,2,3,4,5
    };
    rotateArray(arr,2);


  }
}