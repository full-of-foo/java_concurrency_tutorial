public class Hello{
	
	class HelloThread extends Thread {
		public void run() {
	        System.out.println("Hello from a thread 1!");
	    }

	}
	
	class HelloRunnable implements Runnable {
		   public void run() {
		      System.out.println("Hello from a thread 2!");
		   }
	}

	
    public static void main(String args[]) {
    	Hello hello = new Hello();
    	
        (hello.new HelloThread()).start();
        (new Thread(hello.new HelloRunnable())).start();
    }

}
