package SampleStreams;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDemo a = new SampleDemo("A");
		SampleDemo b = new SampleDemo("B");
		b.start();a.start();
	}

}
