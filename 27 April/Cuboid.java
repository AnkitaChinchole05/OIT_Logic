
class Cuboid{
    public static void main(String[] args){
        Double l=10.0;
        Double w=5.0;
        Double h=3.0;

        Double v=l*w*h;
        Double SA=2*(l*w+l*h+w*h);

        System.out.println("Volume of cuboid:"+v);
        System.out.println("Surface area of cuboid:"+SA);
    }
}