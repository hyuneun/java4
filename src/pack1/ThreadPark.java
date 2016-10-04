package pack1;

public class ThreadPark extends Thread{
		@Override
		public void run() {
			ThreatTest3Main.mybank.savedMoney(5000);
			System.out.println("남편입금후잔고" + ThreatTest3Main.mybank.getMoney());
		}
}
