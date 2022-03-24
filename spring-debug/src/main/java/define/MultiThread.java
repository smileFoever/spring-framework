package define;

public class MultiThread {

	public static void attack(){
		System.out.println("子线程");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(){
			public void run(){
				attack();
			}
		};
		t.run();
	}
}
