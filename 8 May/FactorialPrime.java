class FactorialPrime{
    public static void main(String[] args){
        int n=2;
        int fact=1;
        
        int num=n;
        while(num>=1){
         fact*=num;
            num--;
        }
        System.out.println(n+" Factorial "+fact);
        int i=2;
        boolean isPrime=true;
        while(i<=Math.sqrt(fact)){
            if(fact%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime==true){
            System.out.println(fact+"  number is prime number");
        }else{
            System.out.println(fact+"  is not prime number ");
        }
    }
}