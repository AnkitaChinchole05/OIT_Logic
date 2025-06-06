import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        System.out.println("Number: " + n);
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Rev : " + rev);

        while (rev > 0) {
            int digit = rev % 10;
            if (digit == 1){
                System.out.print(" One");
            } else if (digit == 2){
                System.out.print(" Two");
            } else if (digit == 0){
                System.out.print(" zero ");
            }
            rev /= 10;
        }

    }
}