import java.util.Scanner;

public class DoubleFactorial {
    static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();
        int fact = doubleFactorial(num);
        System.out.println(fact);

    }
}
