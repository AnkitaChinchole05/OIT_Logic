public class SwappingNumber {

    static void swapNumber(int a,int b){
       a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a+" and b:"+b);
    }
    public static void main(String[] args) {
        swapNumber(5,4);
    
    }
}
