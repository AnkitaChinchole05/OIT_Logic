public class Pattern7 {
    public static void main(String[] args) {
        char ch = 'E';
        for (char i = 'A'; i <= ch; i++) {
            for (char j = 'A'; j <= ch; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }
}
