package day_0521_api_class.object;

public class FinalizeExample {
	
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1;i<=50;i++) {
			counter = new Counter(i);
			
			counter = null;
			System.gc();
		}
	}
}
