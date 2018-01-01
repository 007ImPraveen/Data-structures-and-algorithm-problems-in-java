import java.util.Arrays;
public class FindPairs{
  public static void findPairsBrute(int[] arr,int value ){
    int size = arr.length;
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if (arr[i]+arr[j] == value ){
          System.out.println("Pair found " + arr[i] +" " + arr[j]);
        }
      }
    }
  }

  public static void findPairsSorted(int[] arr,int value){
    int size= arr.length;
    Arrays.sort(arr);
    int first=0,last=size-1;
    while(first<last){
      if( (arr[first]+ arr[last]) < value ){
        first+=1;
      }
      else if((arr[first]+arr[last]) >value ){
        last-=1 ;
      }
      else if((arr[first]+arr[last]==value)){
        System.out.println("Pair found (optimized way) " + arr[first] + " " + arr[last]);
        first++;
      }
    }
  }
  public static void main(String[] args){
    int[] arr={
      1,2,3,4,5,6,7
    };
    findPairsBrute(arr,9);
    findPairsSorted(arr,9);
  }
}