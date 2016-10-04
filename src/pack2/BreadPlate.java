package pack2;

public class BreadPlate {
	private int breadCount = 0;//공유대상

	public BreadPlate() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void makeBread(){
		if(breadCount >= 10){
			try {
				System.out.println("빵살돈없음");
				wait();//스레드를 비활성화
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		breadCount++;
		System.out.println("빵가져옴 총" + breadCount + "개" );
		this.notify();//스레드를 활성화
	}

	public synchronized void eatBread(){
		if(breadCount < 1){
			try {
				System.out.println("명호는빵이없어배고프다");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		breadCount--;
		System.out.println("명호가뻇어먹음 총" + breadCount + "개" );
		this.notify();//이제 먹어도 됨
	}






}
	