import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n2=((n%10000)%100)/10;
      System.out.println(n2);
	}
}