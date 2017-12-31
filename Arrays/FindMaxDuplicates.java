public class FindMaxDuplicates{
  public static void FindMaxBrute(int[] arr){
    int max_val=0, max_count=1,current_count=1,size= arr.length;
    for(int i=0;i<size;i++){
      current_count =1 ;
      for(int j=i+1;j<size;j++){
        if(arr[i]==arr[j]){
          current_count+=1;
        }
      }
        if (current_count>max_count){
          max_count = current_count;
          max_val = arr[i];
        }

    }
    System.out.println("The number  "+max_val + " occured over " + max_count + " times ");
  }
  public static void main(String[] args){
    int[] arr={
      1,2,3,4,5,7,7,7
    };
    FindMaxBrute(arr);

  }
}