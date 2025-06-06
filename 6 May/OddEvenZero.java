import java.util.Scanner;

public class OddEvenZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int odd=0;
        int even=0;
        int zero=0;
        if(num==0){
            //zero=1;
        }else{
            while(num!=0){
                int digit=num%10;
                if(digit==0){
                    zero++;
                }else if(digit%2==0){
                    even++;
                }else{
                    odd++;
                }
                num/=10;
             }
         }
         System.out.println(even+" :even digits");
         System.out.println(odd+" :odd digits");
         System.out.println(zero+" :zero digits");
    }
}
