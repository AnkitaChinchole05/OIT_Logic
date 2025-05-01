import java.util.*;
class DollerToRupees{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Dollers:");
        int doller=sc.nextInt();

        Double Rupees=(doller*85.33);
        System.out.println("The Indian Rupees: "+Rupees+" Rs.");
    }
}