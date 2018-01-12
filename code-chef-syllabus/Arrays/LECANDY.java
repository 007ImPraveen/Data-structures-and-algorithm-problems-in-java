import java.util.*;
class LECANDY
{
  public  static void main(String[] args)
  {
    int n,t,c;
    Scanner sc= new Scanner(System.in);
    t = sc.nextInt();
    while( t>0 )
    {
      t--; 
      n = sc.nextInt();
      c = sc.nextInt();
      int sum =0; 
      int[] a = new int[n];
      for(int i = 0; i<n; i++)
      {
        a[i] = sc.nextInt();
        sum += a[i];
      }
      if (sum <= c )
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}