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
  public static void main(String[] args){
    int[] arr={
      1,2,3,4,5,6,7
    };
    findPairsBrute(arr,9);
  }
}