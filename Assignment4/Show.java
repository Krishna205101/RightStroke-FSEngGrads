class Thread1 extends Thread{
	public void run(){
		try {
			for(int i=0;i<5;i++){
				System.out.println("Thread1");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		try {
			for(int i=0;i<5;i++){
				System.out.println("Thread2");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Show{

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
	}

}
