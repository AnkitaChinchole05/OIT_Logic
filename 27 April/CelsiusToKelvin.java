import java.util.*;
class CelsiusToKelvin{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter celsius:");
       Double celsius=sc.nextDouble();
       Double kelvin=celsius+273.15;
       System.out.print(celsius+"degrees celsius is equal to "+kelvin+" kelvin");
       

    }
}