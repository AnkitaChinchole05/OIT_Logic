import java.util.*;
class GrossSalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic salary:");
        Double bs=sc.nextDouble();
        Double DA=0.40*bs;
        Double HRA=0.20*bs;
        Double gs=DA+HRA;
        System.out.println("The Gross Salary of Rajesh is:"+gs);
    }
}