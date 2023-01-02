import java.util.*;
import java.lang.*;
class arrayexception
{
  public static void main(String args[])
  {
    int n,p;
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter the array size");
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array values");
    for (int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    try
    {
      System.out.println("Enter index value");
      p=obj.nextInt();
      System.out.println(a[p]);
    }
    
    catch(IndexOutOfBoundsException e)
    {
      System.out.println("Invalid index value");
    }
  }
}