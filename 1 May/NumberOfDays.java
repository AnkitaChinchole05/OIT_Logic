import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Month");
        System.out.println("-------------------------------");
        System.out.println("1.January");
        System.out.println("2.February");
        System.out.println("3.March");
        System.out.println("4.April");
        System.out.println("5.May");
        System.out.println("6.June");
        System.out.println("7.July");
        System.out.println("8.August");
        System.out.println("9.September");
        System.out.println("10.October");
        System.out.println("11.November");
        System.out.println("12.December");
        System.out.println("------------------------------------");
        System.out.print("Enter month:");
        int month=sc.nextInt();
        if(month>=1 && month<=12){
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                System.out.println("-----------------------------------");
                System.out.println("31 Days in this month");
            }else if(month==4 || month==6 || month==9 || month==9 || month==11){
                System.out.println("-----------------------------------");
                System.out.println("30 Days in this month");
            }else{
                System.out.print("Enter the year:");
                int year=sc.nextInt();
                if(year%4==0){
                    System.out.println("-------------------------------");
                    System.out.println(" 29 Days in this month");
                }else{
                    System.out.println("-------------------------------");
                    System.out.println("28 Days in this month");
                }
            }
        }

    }
}
