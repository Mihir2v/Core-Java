/* W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution*/
package corejb;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + "-Count");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class OThread2 {

	public static void main(String[] args) {
		MyThread thread1 =new MyThread();
		MyThread thread2 =new MyThread();
		
		thread1.start();
		thread2.start();
				
	}
}
