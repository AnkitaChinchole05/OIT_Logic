import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        int a=i;
        int pal=0;

        do{
            int digit=i%10;
            pal=pal*10+(digit);
            i/=10;
        }while(i>0);
        i++;
        i=a;
        if(a==pal){
            System.out.print(pal+" ");
        }
    }
}
}
