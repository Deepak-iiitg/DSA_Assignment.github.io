import java.util.Scanner;
class Assignment_17
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in); 
    int n = sc.nextint();
    System.out.println(fib(n));
    }
}