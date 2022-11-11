
public class Assignment {
	public static void main(String args[]) {
		try {
			int blah = 7/0;
		    int[] number = {1,4,5};
		    for(int i = 0; i <= 7; i++) {
		    	System.out.println(number[i]);
		    }
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Here is 1");
		}
		catch(ArithmeticException e) {
			System.out.println("Dos");
		}
		finally {
			System.out.println("tada");
		}
	}
}
