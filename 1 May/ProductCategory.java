import java.util.*;
public class ProductCategory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your product category");
        System.out.println("1.Electronics");
        System.out.println("2.Clothing");
        System.out.println("3.Food");
        System.out.print("choice your category:");
        int ct=sc.nextInt();
        System.out.print("Enter amount of:");
        double amt=sc.nextDouble();
         double Discount=0;
        if(ct<=3 && ct>0){
            if(ct==1){
                Discount=0.10;
                System.out.println("Discount on Electronics:"+Discount);
            }else if(ct==2){
                if(amt>=5000){
                    Discount=0.20;
                    System.out.println("your discount is:"+Discount);
                }else{
                    Discount=0.15;
                    System.out.println("Your Discount is:"+Discount);
                }
            }else if(ct==3){
                if(amt>=1000 && amt<5000){
                    Discount=0.05;
                    System.out.println("Your Discount is:"+Discount);
                }
            }else{
                System.out.println("Invalid option Product Category..Please Try Again!");
            }
        }
    }
}
