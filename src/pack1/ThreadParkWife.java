package pack1;

public class ThreadParkWife extends Thread{
		@Override
		public void run() {
			ThreatTest3Main.mybank.minusMoney(3000);
			System.out.println("아내출금잔고" + ThreatTest3Main.mybank.getMoney()) ;
		}
}
