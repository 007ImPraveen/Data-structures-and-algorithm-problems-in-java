import java.util.Arrays;

public class CountOccurences{
  public static void CountOccurencesBrute(int[] arr,int key ){
    int size= arr.length;
    int count= 0;
    for(int i= 0;i< size;i++){
      if(arr[i]== key){
        count++;
      }
    }
    System.out.println("The given key " +key + " occured over "+ count + " times" );
  }

  public static int CountOccurencesBinarySearch(int[] arr,int key ){
    Arrays.sort(arr);
    int first_index = FindFirstIndex(arr,key);
    int last_index = FindLastIndex(arr,key);
    return (last_index - first_index +1); 
  }
  private static int FindFirstIndex(int[] arr,int key){
    int low  =0, high = arr.length-1;
    int mid; 
    int index= -1;
    while(low <= high){
      mid = (low + high)/2;
      if (key<=arr[mid]){         // move towards the start whenever the value is equal or same, to get out from the middle range
        high =mid-1;
        index= mid;
      }
      else {
        low= mid+1;
      }
    }
    return index; 
  }
   private static int FindLastIndex(int[] arr, int  key){
    int low  =0, high = arr.length-1;
    int mid;
    int index=-1; 
    while(low <= high){  
      mid = (low+high)/2;
      if(key>=arr[mid]){       //move towards the end  
        low =mid+1;
        index = mid;
      }
      else{
        high= mid-1;
      }
    }
    return index;
  }




  public static void main(String[] args){
    int[] arr= {
      1,2,3,4,4,4,4,4,5,2,3,2,4,5,6,7
    };
    CountOccurencesBrute(arr,4);
    System.out.println("Finding the count with binary search " + CountOccurencesBinarySearch(arr,4));
    }
  }
}