package TwoPointerProblems;

public class Thread1 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i <= 9; i++) {
			  System.out.println("h this is lambda expression inside thread"); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Thread thread = new Thread(() -> { for (int i = 0; i <= 9; i++) {
		 * System.out.println("h this is lambda expression inside thread"); } });
		 * 
		 * Runnable r = () -> { for (int i = 0; i <= 9; i++) {
		 * System.out.println("h this is lambda expression inside thread"); } };
		 */
		
		Thread1 thread = new Thread1();

		Thread t1 = new Thread(thread);

		t1.start();
	}

}
