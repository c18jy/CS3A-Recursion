/*
 * This class will not be graded, it is for your use in testing.
 */

public class LettersTest {
	public static void main(String[] args) {
		System.out.println("isPalindrome " + (palindromeTest()?"Passed":"Failed"));
	System.out.println("Letter count " + (letterCountTest()?"Passed":"Failed"));
	System.out.println("Capital count" + (capitalCountTest()?"Passed":"Failed"));
	System.out.println("Word count" + (wordCountTest()?"Passed":"Failed"));
	System.out.println("Contains" + (containsTest()?"Passed":"Failed"));
}
	
	/*
	 * note: you should test more thoroughly than this:
	 */
	static boolean palindromeTest() {
		if(Letters.isPalindrome("ABBA")!=true) return false; 
		return true;
	}
	
	static boolean letterCountTest() {
		if(Letters.letterCount("Hello".toCharArray(), 'l')!=2) return false;
		return true;
	}

	static boolean capitalCountTest(){
		if(Letters.capitalCount("HelLO".toCharArray())!= 3) return false;
		return true;
	}
	
	static boolean wordCountTest(){
		if(Letters.wordCount("Hello world".toCharArray()) != 2) return false;
		return true;
	}

	static boolean containsTest(){
		if(Letters.contains("Hello".toCharArray(), "l".toCharArray()) != true) return false;
		return true;

	}

}
