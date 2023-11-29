/*W.A.J. P to create one thread by implementing Runnable interface in 
Class. */
package corejb;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i + " - Thread: " + Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class NRunnable {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();

		Thread myThread = new Thread(myRunnable);

		myThread.start();
	}
}
