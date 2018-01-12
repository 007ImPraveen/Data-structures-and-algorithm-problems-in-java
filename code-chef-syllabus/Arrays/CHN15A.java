//https://www.codechef.com/problems/CHN15A

import java.util.*;

class CHN15A
{
  public static void main(String[] args)
  {
    int t; 
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while (t > 0)
    {
      t--;
      int n,k,count = 0 ;
      n = sc.nextInt();
      k = sc.nextInt();
      for (int i =0 ;i< n; i++)
      {
        int for_val = sc.nextInt(); 
        if ((for_val + k) % 7 == 0)
          count++;
      }
      System.out.println(count);

    }
  }
}