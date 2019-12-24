
public class Schedular {

	public static void main(String[] args) {
		final long timeInterval = 5000;		
		Runnable runnable = new Runnable() 
		{
			public void run() 
			{
				int i=0;
				while (i!=5) 
				{
					print(i);
					try {
						Thread.sleep(timeInterval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i++;
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	
	public static void print(int i)
	{
		System.out.println("Hi Mahendra "+i);
	}
}
