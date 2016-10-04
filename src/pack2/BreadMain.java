package pack2;

public class BreadMain {

	public static void main(String[] args) throws InterruptedException {
		//빵자원 공유여부확인
		
		BreadPlate bp = new BreadPlate();
		
		BreadMaker ma = new BreadMaker(bp);
		BreadEater et = new BreadEater(bp);
		
		ma.start();
		ma.setPriority(10);
		et.start();
				
		ma.join();
		et.join();
		System.out.println("돈이없다");
	}

}
