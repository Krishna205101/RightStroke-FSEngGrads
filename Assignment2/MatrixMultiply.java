import java.util.*;
class MatrixMultiply{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,j,n,k;
		System.out.println("enter the size of matrix");
		n=s.nextInt();
		int[][] a=new int[n][n];
		int[][] b=new int[n][n];
		int[][] c=new int[n][n];
		System.out.println("enter the first matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the second matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("the resultant matrix is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
				     c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
			System.out.print(c[i][j]+" ");
          }
          System.out.println();
		}
	}
}