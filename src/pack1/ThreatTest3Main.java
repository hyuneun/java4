package pack1;

public class ThreatTest3Main {
	//스레드 동기화: 하나의 자원을 여러스레드가공유
	
	public static ThreadBank mybank = new ThreadBank();
	
	
	public static void main(String[] args) {
		System.out.println("원금" + mybank.getMoney());
		
		ThreadPark park = new ThreadPark();
		ThreadParkWife wife = new ThreadParkWife();
		
		park.start();
		park.setPriority(10);
		wife.start();
	}
}
