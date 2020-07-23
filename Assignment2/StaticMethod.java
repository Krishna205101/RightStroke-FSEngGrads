public class StaticMethod {
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String args[]) {
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        sum(i,j);
    }
}