public class Pattern1 {
    public static void main(String[] args) {
          int n=5;

        
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            if(i>j){
            System.out.print((char)(96+j)+" ");
           }else{
            System.out.print("  ");
           }
        }
        System.out.println();
    }
        for(int i=2;i<=n;i++){
           for(int j=1;j<=n;j++){
            if(i+j<n+1){
            System.out.print((char)(96+j)+" ");
           }else{
            System.out.print("  ");
           }
        }
        System.out.println();
    }
    }
}
