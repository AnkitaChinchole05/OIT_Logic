import java.util.*;
class  DivisibleBy {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int num=sc.nextInt();
    if(num%17==0){
        System.out.println(num+" Divisible by 17");
    }else{
        System.out.println(num+" not divisible by 17");
    }
}

}
