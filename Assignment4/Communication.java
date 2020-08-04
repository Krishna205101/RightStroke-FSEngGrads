class IntThread{
	private int amount=1000;
	synchronized void withdraw(int amount){
		if(this.amount<amount){
			try{
				System.out.println("waiting for deposit..");
				wait();
				System.out.println("Amount withdrawn.");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	synchronized void deposit(int amount){
		this.amount+=amount;
		System.out.println("Amount deposited.");
		notify();
	}
}

public class Communication{

	public static void main(String[] args) {
		final IntThread p=new IntThread();
		new Thread(){
			public void run(){
				p.withdraw(1500);
			}
		}.start();
		new Thread(){
			public void run(){
				p.deposit(1000);
			}
		}.start();

	}

}
