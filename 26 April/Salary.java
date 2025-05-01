import java.util.*;
class Salary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double s=sc.nextDouble();

        Double HRA=0.1*s;
        Double TA=0.05*s;
        Double DA=0.15*s;
        Double GrossSalary=s+HRA+TA+DA;
        System.out.println("HRA:"+HRA);
        System.out.println("DA:"+DA);
        System.out.println("TA:"+TA);
        System.out.println("Gross Salary:"+GrossSalary);
    }
}