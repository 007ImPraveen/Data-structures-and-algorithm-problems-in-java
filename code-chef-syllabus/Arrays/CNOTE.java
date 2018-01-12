import java.util.*;

class CNOTE
{
  public static void main(String[] args)
  {
    int t;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while (t > 0)
    {
      t--;
      int y,x,k,n;
      x = sc.nextInt();
      y = sc.nextInt();
      k = sc.nextInt();
      n = sc.nextInt();
      int page_required = x - y;
      int p, c; 
      boolean found = false; 

      for (int i = 0; i < n; i ++ )
      {
        p = sc.nextInt();
        c = sc.nextInt();
        if (p >= page_required  && k >= c)
        {
          found = true;
        } 

      }
      if (found) 
        System.out.println("LuckyChef");
      else 
        System.out.println("UnluckyChef");


    } 
  }
}