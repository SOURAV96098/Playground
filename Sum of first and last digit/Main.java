import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in=new Scanner(System.in);
    int n= in.nextInt();
    int f=n;
    int l;
    while(f>=10)
    {
      f=f/10;
    }
    l=n%10;
    System.out.println(f+l);
  }
}
