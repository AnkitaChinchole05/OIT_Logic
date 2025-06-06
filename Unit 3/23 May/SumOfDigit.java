import java.util.Scanner;

public class SumOfDigit {
    static int SumDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + SumDigit(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum=SumDigit(num);
        System.out.println(sum);

    }
}
