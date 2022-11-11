
public class GoTooFar {
	public static void main(String args[]) {
		int myarray[] = {1,2,3,4,5};
		int i = 0;
		try {
		while(i < 9){
			System.out.println(myarray[i]);
			i++;
		}
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Now you've gone too far");
		}
}
}
