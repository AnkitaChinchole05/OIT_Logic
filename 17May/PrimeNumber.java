class PrimeNumber{
    public static void main(String[] args){
       int num=15;
        boolean isPrime=true;
        int i=2;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime==true){
        System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }
    }
}