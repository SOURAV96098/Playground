import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); 
      int temp, mod, sum = 0;
        temp = n;
        while(n > 0)
        {
            mod = n % 10;
            sum=sum + fact (mod);
            n  = n /10;
        }
        if(temp == sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
  public static int fact(int num)
    {
        int fact=1;
    
        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
        
}