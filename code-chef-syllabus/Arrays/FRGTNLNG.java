// https://www.codechef.com/problems/FRGTNLNG

import java.util.*;

class FRGTNLNG 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while ( t>0 )
    {
      t--;
      int n= sc.nextInt();
      int k = sc.nextInt();
      String[] Dictionary = new String[n];
      boolean[] used = new boolean[n];
      for(int i = 0;i < n; i++)
      {
        Dictionary[i] = sc.next();
      }
      for(int i = 0; i < k; i++)
      {
        int l = sc.nextInt();
        while(l-- >0)
        {
          String s= sc.next();
          for(int j = 0; j < n; j++)
          {
            if(!used[j] && Dictionary[j].equals(s))
            {
              used[j] = true;
              break;
            }
          }
        }
      }
      for(int i =0 ; i < n; i++)
      {
        if (used[i])
          System.out.print("Yes ");
        else
          System.out.print("No ");
      }
      System.out.println();
      
    }
  }
}

