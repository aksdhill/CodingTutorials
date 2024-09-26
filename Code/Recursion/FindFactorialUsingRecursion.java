package Code.Recursion;

public class FindFactorialUsingRecursion {
    public static void main(String[] args)
    {
        int number = 5;
        int fact = factorial(number);
        System.out.println("Factorial of "+ number+" = "+fact);

    }

    public static int factorial(int number)
    {
        if(number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}