public class NEven {
    public static void main(String args[]) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.print("The even numbers between "+a+" and "+b+" are ");
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}