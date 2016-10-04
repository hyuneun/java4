package pack1;

public class ThreatTest2 implements Runnable{
	public ThreatTest2() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreatTest2(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}
	
	@Override
	public void run(){
		for(int i =  0; i <= 100; i++){
			System.out.println(i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);//1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		/*
		ThreatTest2 t1 = new ThreatTest2();
		ThreatTest2 t2 = new ThreatTest2();
		Thread t12 = new Thread(t1);
		Thread t13 = new Thread(t2);
		t12.start();
		t13.start();
		System.out.println("종료");
		*/
		new ThreatTest2("하나");//생성자로 스레드부르기
		new ThreatTest2("둘");
		System.out.println("끝");
	}

}
