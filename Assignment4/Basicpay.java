import java.util.*;
class PayOutOfBoundsException extends Exception{
	private int pay;
	public PayOutOfBoundsException(int pay) {
		this.pay=pay;
	}
	public String toString(){
		return "Invalid Pay";
		
	}
}
public class Basicpay{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pay=sc.nextInt();
		try{
			if(pay<=10000 || pay>=30000){
				throw new PayOutOfBoundsException(pay);
			}
			System.out.println(pay);
		}
		catch(PayOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
