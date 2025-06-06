import java.util.Scanner;

public class FactorialNumber {

    static int Factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();
        int fact = Factorial(num);
        System.out.println(fact);

    }
}
