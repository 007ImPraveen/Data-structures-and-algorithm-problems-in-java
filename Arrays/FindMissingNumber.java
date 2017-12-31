import java.io.*;
public class FindMissingNumber{
  public static int findMissingNumberSummation(int[] arr,int n){
    int total_sum = (n*(n+1))/2;
    int sum = 0;
    for(int i:arr){
      sum+=i;
    } 
    return (total_sum-sum);

  }

  public static void findMissingNumberBrute(int[] arr,int n ){
    boolean found = false;
    int number = 0;
    int size = arr.length;
    for(int i= 1;i<= n;i++){
      found= false;
      for(int j=0;j<size;j++){
        if (i==arr[j]){
          found= true;
          number= arr[j];
          break;
        }
      }
      if (!found){
        System.out.println(" This number is not present "+ i);
      }
    }
  }
  
  public static void main(String[] args){
    int[] arr ={
      1,2,3,4,5,6,8,9
    };

    findMissingNumberBrute(arr,9);
    System.out.println("This number is not present (using summation method) "+ findMissingNumberSummation(arr,9));

  }
}