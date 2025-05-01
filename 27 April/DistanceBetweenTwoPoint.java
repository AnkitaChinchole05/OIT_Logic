class DistanceBetweenTwoPoint{
    public static void main(String[] args){
        Double x1=1.0;
        Double y1=2.0;
        Double x2=4.0;
        Double y2=6.0;

        Double Distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.println("The distance between the two point: "+Distance);

    }
}