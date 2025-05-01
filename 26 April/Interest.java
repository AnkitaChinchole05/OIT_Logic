import java.util.*;
class Interest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal: ");
        Double P=sc.nextDouble();
        System.out.print("Enter Interest Rate: ");
        Double r=sc.nextDouble();
        System.out.print("Enter Time In Year: ");
        int t=sc.nextInt();
       // System.out.print("Enter number of year the money is invested: ");
        //int n=sc.nextInt();
        Double Simple_Interest=(P*r*t)/100;
        System.out.println("The Simple Interest:"+Simple_Interest);
        Double Compound_interest=P*Math.pow(1+r/100,t)-P;
        System.out.println("The Compound interest:"+Compound_interest);
        

    }
}