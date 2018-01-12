// logic..... choose the minimum value, and reduce one from the remaining elements until they all become equal to min 



import java.util.*;

class SALARY
{
  public static void main(String[] args)
  {
    int t; 
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while(t > 0 )
    {
      t--;
      int n = sc.nextInt();
      int sum = 0; 
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++ )
      {
        int curr_val  = sc.nextInt();
        sum += curr_val;
        if (curr_val <  min)
          min = curr_val;
      }
      System.out.println(sum - n*min);
    }
  }
}