public class Pattern2 {
    public static void main(String[] args) {
        char n='E';
         for(char i='A';i<=n;i++){
            for(char j='A';j<=n;j++){
                if(i>=j){
                System.out.print(j+" ");
            }
        }
            System.out.println();
        }
    }
}
