/*W.A.J.P to start the same Thread twice by calling start () method twice. Test 
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/
package corejb;

class Twice extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is Runnig");
	}
}

public class PT1Start {
	public static void main(String[] args) {
		Twice t1 = new Twice();

		t1.start();
		try {
			Thread.sleep(1000);

			t1.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
