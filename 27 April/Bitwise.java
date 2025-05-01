class Bitwise{
    public static void main(String[] args){
        
        System.out.println(5 & 12);//0101 & 1100 = 0100 (4)
        System.out.println(2 | 12);// 0010 | 1100 = 1110 (14)
        System.out.println(5 ^ 13);// 0101 ^ 1101 = 1000 (8)
        System.out.println(~5);//~5 = -6
        System.out.println(11>>1);//right shift = 1011 >> 0001 =0101(5)
        System.out.println(3<<1);//left shift = 0011 << 0001 =0110(6)
        System.out.println(3<<1);//left shift = 0011 << 0001 =0110(6)

        int a=10;
        int b=20;

        System.out.println("Before swapping: a:"+a+ " b:"+b);

        a=a^b;//01010 ^ 10100 = 11110(30)
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a:"+a+" b:"+b);
        System.out.println(a^b);
       
    }
}