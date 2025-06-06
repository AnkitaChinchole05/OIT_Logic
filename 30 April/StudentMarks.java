import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("marks s1:");
        int s1=sc.nextInt();
        System.out.print("marks s2:");
        int s2=sc.nextInt();
        System.out.print("marks s3:");
        int s3=sc.nextInt();

        if(s1>=40 && s2>=40 && s3>=40){
            //--------------------------
            int total=s1+s2+s3;
            double percentage=total/3.0;
            if(percentage>=90){
                System.out.println("Total:"+total);
                System.out.println("Your Percentage:"+percentage);
                System.out.println("Disctinction");
            }else if(percentage>=70 && percentage <90){
                System.out.println("Total:"+total);
                System.out.println("Your Percentage:"+percentage);
                System.out.println("First class");
            }else if(percentage>=50 && percentage <70){
                System.out.println("Total:"+total);
                System.out.println("Your Percentage:"+percentage);
                System.out.println("second class");
            }else if(percentage>=40 && percentage<50){
                System.out.println("Total:"+total);
                System.out.println("Your Percentage:"+percentage);
                System.out.println("pass class");
            }
        }else{
            System.out.println("fail");
        }
    }
}
