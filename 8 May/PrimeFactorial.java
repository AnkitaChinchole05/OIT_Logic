class PrimeFactorial{
    public static void main(String[] args){
        int num=25;
        int i=2;
        boolean isPrime=true;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        int fact=1;
        int n=num;
        if(isPrime==true){
            while(n>=1){
                fact*=n;
                n--;
            }
            System.out.println(num+" Is prime and factorial is :"+fact);
        }else{
            System.out.println(num+" Is not prime number");
        }
    }
}