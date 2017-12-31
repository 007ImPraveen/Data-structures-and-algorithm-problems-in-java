public class LargestContiguousSum{

  public static int FindMaxSum(int[] arr){
    int current_max_sum =0;
    int max_sum_so_far= 0;
    for(int i: arr){
      current_max_sum+=i;
      if (current_max_sum<0){       //  go back to zero, if current max sum is less than zero 
        current_max_sum=0;
      }
      if(current_max_sum> max_sum_so_far){   // update global max sum if the current is higher 
        max_sum_so_far = current_max_sum;
      }

    }
    return max_sum_so_far;
  }


  public static void main(String[] args){
    int[] arr ={
      1,-2,3,4,-4,6,-14,8,2
    };
    System.out.println(FindMaxSum(arr));
  }

}

