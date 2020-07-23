import java.util.*;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new  int[n][n];
        System.out.println("Enter elements into first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter elements into second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }

        System.out.println("Resultant matrix after addition is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
        s.close();
    }
}