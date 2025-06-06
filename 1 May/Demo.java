import java.util.*;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        Double bs=sc.nextDouble();

        if(bs<70000){
            System.out.println("No Tax");
        }else{
            Double Tax=bs*0.1;
            System.out.println("Tax: "+Tax);
        }
    }
}