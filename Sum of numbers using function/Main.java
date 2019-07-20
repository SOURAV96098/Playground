import java.util.Scanner;
class Main
{
   public static int  square_of_a_number(int n)
   {
    int i;
     int sum =0;
     for(i=0;i<=n;i++)
      sum=sum+i;    
    return sum;
   }
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int sum =  square_of_a_number(n1);
    System.out.println(sum);
   }
}