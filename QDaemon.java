/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
Daemon () method of Thread class and check whether the thread is set daemon or 
not by using is Daemon () method. 
TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
t1.setDaemon(true);//will throw exception here t2.start(); */
package corejb;

class Daemon extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("User Thread");
		}
	}
}

public class QDaemon {

	public static void main(String[] args) {
		Daemon t1 = new Daemon();
		Daemon t2 = new Daemon();
		t1.start();
		try {
			t1.setDaemon(true);
			t2.start();
		} catch (IllegalThreadStateException e) {
			System.out.println("Exception: " + e.getMessage());

		}
	}
}
