import java.util.*;
class Cities{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance between two cities:");
        Double city1=sc.nextDouble();
        Double city2=sc.nextDouble();
        Double Dist=city1+city2;
        Double convert=Dist*1000;
        Double convert1=Dist*10000;
        System.out.println("Convert distance meter in:"+convert);
        System.out.println("Convert distance cmeter in:"+convert1);
    }
}