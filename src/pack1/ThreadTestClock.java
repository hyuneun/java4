package pack1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class ThreadTestClock extends Frame implements ActionListener, Runnable {
	Label lblshow;
	int i = 0;
	Thread thread;
	Boolean b = false;//스레드종료를위한
	
	
	public ThreadTestClock() {
		lblshow = new Label("showtime", Label.CENTER);
		add("Center",lblshow);//프레임에 라벨추가 및 화면중앙에 맞춤
		
		Button b1 = new Button("click");
		b1.addActionListener(this);//리스너(장착클릭할때)
		add("North", b1);
		
		Button b2 = new Button("stop");
		b2.addActionListener(this);//리스너(장착클릭할때)
		add("East", b2);
		
		setTitle("srad clak");
		setBounds(200,200,800,800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() { //내부무명클래스
		@Override
		public void windowClosing(WindowEvent e) {
			b = true;
			System.exit(0);
		}
	
		});
		
		thread = new Thread(this);
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.print("히히히히히히");
		//showData();
		System.out.println(i+=2);
		if(thread.isAlive()) return; //버튼이 눌려있으면 아무반응x
		thread.start();
	}
	
	
	
	@Override
	public void run() {
		while(true){
			if(b == true) break;
			showData();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
		}
		
	}
	
	
	
	 private void showData(){
		 Calendar c = Calendar.getInstance();
		 int y = c.get(c.YEAR);
		 int m = c.get(c.MONTH) + 1;
		 int d = c.get(c.DATE);
		 int h = c.get(c.HOUR_OF_DAY);
		 int mi = c.get(c.MINUTE);
		 int s = c.get(c.SECOND);
		 lblshow.setText(y + "-" + m + "-" + d + "\n" + h + ":" + mi + ":" + s); 
	 }
	public static void main(String[] args) {
		new ThreadTestClock();

	}

}
