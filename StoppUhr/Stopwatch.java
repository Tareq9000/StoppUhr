package StoppUhr;

public class Stopwatch {
	long start;
	long stop;
	double time;
	boolean run = false;

	public void start() {
		start = System.currentTimeMillis();
		run = true;
	}
	
	public void stop() {
		stop = System.currentTimeMillis();
		run = false;
	}

	public String toString() {
		time = stop - start;
		time = time / 1000;
	
		return "time:\t" + time + " seconds";
		
	}
}

