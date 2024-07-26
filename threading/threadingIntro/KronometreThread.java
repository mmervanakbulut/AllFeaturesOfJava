package threadingIntro;


public class KronometreThread implements Runnable {
	
	private Thread thread;
	private String threadName;
	
	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluşturuluyor.... " + threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Run method is working." + threadName);
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(threadName + ": "+ i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Kesildi " + this.threadName );
			e.printStackTrace();
		}
		
		System.out.println("Thread bitti : " + threadName);
		
	}
	public void strat() {
		System.out.println("Thread nesnesi oluşuyor....");
		if (thread == null) {
			thread = new Thread(this,threadName);
			thread.start();
		}
	}
}
