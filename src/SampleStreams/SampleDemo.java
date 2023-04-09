package SampleStreams;

public class SampleDemo implements Runnable {

	private String ThreadName;
	private Thread t;
	public SampleDemo(String ThreadName){
		this.ThreadName=ThreadName;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
    while(true) {
    	System.out.println(ThreadName);
    }
	}
	public void start() {
		if(t==null) {
			t = new Thread(this,ThreadName);
			t.start();
		}
	}

}
