import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=2;//start to the number 2 checking for divisibility for giving number
        boolean isPrime=true;
        while(i<=Math.sqrt(num)){ //it is the num variable square root 
            if(num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime==true){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }
    }
}