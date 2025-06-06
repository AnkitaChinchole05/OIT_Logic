import java.util.*;
public class FailOrATKT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter s1 marks:");
        int s1=sc.nextInt();
        System.out.print("Enter s2 marks:");
        int s2=sc.nextInt();
        System.out.print("Enter s3 marks:");
        int s3=sc.nextInt();

        if(s1>=40 && s2>=40 && s3>=40){
            //--------------------------
            int total=s1+s2+s3;
            double percentage=total/3.0;
            if(percentage>=90){
                System.out.println("Disctinction");
            }else if(percentage>=70 && percentage <90){
                System.out.println("First class");
            }else if(percentage>=50 && percentage <70){
                System.out.println("second class");
            }else if(percentage>=40 && percentage<50){
                System.out.println("pass class");
            }
        }else{
            System.out.println("ATKT");
        }
    }
}
