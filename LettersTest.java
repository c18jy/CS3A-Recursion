/*
 * This class will not be graded, it is for your use in testing.
 */

public class LettersTest {
	public static void main(String[] args) {
		System.out.println("isPalindrome " + (palindromeTest()?"Passed":"Failed"));
	}
	
	/*
	 * note: you should test more thoroughly than this:
	 */
	static boolean palindromeTest() {
		if(Letters.isPalindrome("ABBA")!=true) return false; 
		return true;
	}
}
