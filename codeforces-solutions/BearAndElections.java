import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class BearAndElections
{
  public static void solve(int first_key, int[] arr)
  {
    int size = arr.length; 
    Arrays.sort(arr);
    int counter = 0;
    while(first_key <= arr[size-1])
    {
      arr[size-1]--;
      first_key++;
      Arrays.sort(arr);
      counter++;
    }
    System.out.println( counter);
  
  }

  public static void main(String[] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n-1];
    int first_key = sc.nextInt();
    for(int i =0 ; i<n-1;i++)
    {
      arr[i] = sc.nextInt();
    }
    solve(first_key, arr) ;
  }

}