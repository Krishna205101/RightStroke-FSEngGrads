public class NPrimes {
    boolean check(int a) {
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        NPrimes np=new NPrimes();
        int n=Integer.parseInt(args[0]);
        System.out.print("the primes upto "+n+" are ");
        for(int i=2;i<=n;i++){
            if(np.check(i)){
                System.out.print(i+" ");
            }
        }
    }
}