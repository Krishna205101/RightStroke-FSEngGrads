public class Armstrong {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int s = 0;
        int i = n;
        while(i>0){
            int r=i%10;
            s=s+r*r*r;
            i=i/10;
        }
        if(s==n){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
}