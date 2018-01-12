 // https://www.codechef.com/problems/RAINBOWA

import java.util.*;

class RAINBOWA
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while ( t > 0)
    {
      t--;
      int n = sc.nextInt();
      int[] arr = new int[n]; 
      boolean rainbow = true;
      int[] check_val = new int[8];     // To check all values are present 
      int limit = n;
      for(int i =0; i < n; i++) 
      {
        arr[i] = sc.nextInt();
          
      }
        if (n%2 !=0 )
            limit++;                    // To get the correct middle value for odd sized arrays 
      for(int i = 0; i <limit/2 ; i++)
      {
          if (arr[i] > 7)              // we need only 1-7
          {
              rainbow = false;
              break;
          }
          if (check_val[arr[i]] ==0)     
            check_val[arr[i]]+=1;         //To check all elements are present 
          if (arr[i] != arr[n-i-1] )   // To compare from front and back ....
          {
              rainbow =false;
              break;
              
          }
            
            
      }
      if(rainbow)
      {
          for(int i=1;i<8;i++)         
          {
              if(check_val[i]==0)          //check whether any single element is not present 
              {
                  rainbow = false;
                  break;
              }
          }
      }
      if (rainbow)
        System.out.println("yes");
      else
        System.out.println("no");


    }
  } 

}

