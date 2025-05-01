import java.util.*;
class StudentDetail{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter s1 Marks:");
        Double s1=sc.nextDouble();
        System.out.print("Enter s2 Marks:");
        Double s2=sc.nextDouble();
        System.out.print("Enter s3 Marks:");
        Double s3=sc.nextDouble();
        System.out.print("Enter s4 Marks:");
        Double s4=sc.nextDouble();
        System.out.print("Enter s5 Marks:");
        Double s5=sc.nextDouble();

        Double total=s1+s2+s3+s4+s5;
        Double per=(s1+s2+s3+s4+s5)/5;
        System.out.println("Total:"+total);
        System.out.println("per: "+per);

    }
}