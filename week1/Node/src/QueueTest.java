
public class QueueTest {

	public static void main(String[] args) {
		
		int n = 15;
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++){
			a[i]=(int)(Math.random()*1000);
			System.out.println("Position "+(i+1)+": "+a[i]);
		}
		
	}

}