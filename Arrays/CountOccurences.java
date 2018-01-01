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


  public static void main(String[] args){
    int[] arr= {
      1,2,3,4,4,6,4,7
    };
    CountOccurencesBrute(arr,4);
  }
}