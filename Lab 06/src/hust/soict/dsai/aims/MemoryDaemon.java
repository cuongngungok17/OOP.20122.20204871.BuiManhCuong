package hust.soict.dsai.aims;

public class MemoryDaemon  implements Runnable{
	private long memoryUsed;
	public MemoryDaemon() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		while (true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memoryUsed) {
				System.out.println("\tMemory used = "+used);
				memoryUsed = used; 
			}
		}
	}
}
