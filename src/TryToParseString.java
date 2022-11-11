
public class TryToParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String tryIt = "blah";
		Integer.parseInt(tryIt);
		}
		catch(NumberFormatException e) {
			System.out.println("Idiot");
		}
	
	}

}
