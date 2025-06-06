public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
       
         for(int i=1;i<=n;i++){
            System.out.print(i);
            for(int j=i;j<=n;j++){
                if(i>=j){
                System.out.print(j+" ");
                
            }
            
            
        }
            System.out.println();
        }
}
}