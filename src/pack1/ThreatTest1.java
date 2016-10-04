package pack1;

public class ThreatTest1 extends Thread {
	public ThreatTest1() {

	}

	public ThreatTest1(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + " " + super.getName());
		}

	}

	public static void main(String[] args) throws Exception {

		/*
		 * process 단위의 실행 Process p1 = Runtime.getRuntime().exec("calc.exe");
		 * Process p2 = Runtime.getRuntime().exec("notepad.exe"); p1.waitFor();
		 * p2.destroy(); System.out.println("p1:" + p1.exitValue());
		 * System.out.println("p1:" + p2.exitValue()); }catch(Exception e){
		 * System.out.println("err" + e); }
		
		 */ // 스레드를 사용x경우
		ThreatTest1 t1 = new ThreatTest1();
		ThreatTest1 t2 = new ThreatTest1();
		t1.start();// run을 부른다
		t2.start();
		t2.setPriority(10);// 우선순위변경(10이라도 무조건 앞은 아님)
		t1.join();//스레드가 끝날때까지 메인 스레드 실행을 보류한다
		t2.join();
		Thread.yield();//현재쓰레드를 일시적으로 멈추고 다른스레드실행(양보)
		System.out.println("종료");

	}

}
