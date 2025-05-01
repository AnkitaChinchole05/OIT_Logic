import java.util.*;
class KilometerToMeter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many Kilometers:");
        int Kilometer=sc.nextInt();
        int meter=Kilometer*1000;
        System.out.println("Kilometer to meters conversion:"+meter+" meters");
    }
}