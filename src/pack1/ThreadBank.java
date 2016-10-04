package pack1;

public class ThreadBank {
	private int money = 10000;//공유자원

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	//     synchronized 값을 동기화(공유)해서 쓰고싶을떄
	public synchronized void savedMoney(int mon){//입금
		int m = getMoney();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m + mon);
	}
	
	public synchronized void minusMoney(int mon){//출금
		int m = getMoney();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m - mon);
	}
}
