import java.util.Scanner;
class Main
{
   public static int  square_of_a_number(int n)
   {
    int son = (n*n);
    return son;
   }
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int son =  square_of_a_number(n1);
    System.out.println(son);
   }
}