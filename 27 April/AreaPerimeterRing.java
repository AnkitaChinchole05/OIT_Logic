import java.util.*;
class AreaPerimeterRing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("outer radius of ring:");
        Double or=sc.nextDouble();
        System.out.print("inner radius of ring:");
        Double ir=sc.nextDouble();
       
        Double area=Math.PI*(or*or-ir*ir);
        Double op=2*Math.PI*or;
        Double ip=2*Math.PI*ir;
        Double totalPerimeter=op+ip;
        System.out.println("Area of ring:"+area);
        System.out.println("Perimeterof the ring:"+totalPerimeter);
    }
}