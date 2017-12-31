import java.util.ArrayList;
import java.util.Scanner ;
import java.util.Collections;
public class ArrayListDemo {
  public static void main(String[] args){
    ArrayList<Integer> al = new ArrayList<Integer>();
    Scanner sc=  new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int n= sc.nextInt();
    for (int i=0;i<n;i++){
      int val = sc.nextInt();
      al.add(val);
    }

    System.out.println(" After  sorting : ");
    Collections.sort(al);
    for(int a:al){
      System.out.println(a);
    }

  }
}