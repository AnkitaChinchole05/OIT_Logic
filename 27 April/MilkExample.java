import java.util.*;
class MilkExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  a milk(in liters):");
        int milk=sc.nextInt();
        int Water=milk/4;
        Double milkcost=milk*28.5;
        int processedmilk=milk+Water;
        Double SalesCost=processedmilk*58.4;
        Double Profit=SalesCost-milkcost;
        System.out.println("Total Profit:"+Profit+" Rs.");
    }
}