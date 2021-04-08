package lambda;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	//System.out.println("in thread");	
		for(int i =0;i<5;i++) {
			System.out.println("in the thread");
		}
	}

	
	

}
