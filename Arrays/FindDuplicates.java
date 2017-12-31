import java.util.Arrays;
import java.util.HashSet;


public class FindDuplicates{
  /* this function  finds the duplicates present in the array using Brute force approach */ 

  public static void printDuplicatesBrute(int[] arr){
    System.out.println("Find Duplicates with Brute force : ");
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if (arr[i]==arr[j]){
          System.out.print(arr[i] + " ");
        }
      }
    }
    System.out.println();
  }

  public static void printDuplicatesSorted(int[] arr){
    System.out.println("Find Duplicates with sorted method : ");
    Arrays.sort(arr);
    for(int i=1;i<arr.length;i++){
      if(arr[i]==arr[i-1]){
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();

  }

  public static void printDuplicatesHash(int[] arr){
    System.out.println("Find duplicates with the help of Hash set ");
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int i:arr){
      if (hs.contains(i)){
        System.out.print(i + " ");
      }
      else{
        hs.add(i);
      }
    }
    System.out.println();
  }
  public static void printDuplicatesCount(int [] arr){
    System.out.println("Find duplicates with the help of count array  ");
    int[] count = new int[100]; // some value based on the range of the inputs.
    for(int i:arr){
      if(count[i]==1){
        System.out.print(i + " ");
      }
      else{
        count[i]+=1;

      }
    }

  }
  public  static void main(String[] args){

    int[] array = {
      1,2,3,4,5,5,5,6,7,7 
    };
    printDuplicatesBrute(array);
    printDuplicatesSorted(array);
    printDuplicatesHash(array);
    printDuplicatesCount(array);
  }
}
