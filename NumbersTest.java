
public class NumbersTest {
	public static void main(String[] args) {
		System.out.println("factorial " + (factorialTest()?"Passed":"Failed"));
	/*	System.out.println("summation" + (summationTest()?"Passed":"Failed")); //if summation test returned true, it'll say passed, if not, failed
		System.out.println("fibonacci" + (fibonacciTest()?"Passed":"Failed")); 
		System.out.println("sumDigits" + (sumDigitsTest()?"Passed":"Failed"));
		System.out.println("productDigits " + (productDigitsTest()?"Passed":"Failed"));
		System.out.println("product" + (productTest()?"Passed":"Failed"));
		System.out.println("sumRange " + (sumRangeTest()?"Passed":"Failed"));

//System.out.println("reverseDigits" + (reverseDigitsTest()?"Passed":"Failed"));
		System.out.println("====================================");
		System.out.println("Reverse:" + (reverseDigitsTest()?"Passed":"Failed"));
		System.out.println("GCD:" + (gcdTest()?"Passed":"Failed"));
		System.out.println("Newton Sqrt" + (sqrtNewtonTest()?"Passed":"Failed"));
		System.out.println("Bisection sqrt" + (sqrtBisectionTest()?"Passed":"Failed"));
		System.out.println("Combination: " + (combinationTest()?"Passed":"Failed"));
*/
}
	
	static boolean factorialTest() {
		if(Numbers.factorial(0)!=1) return false; 
		if(Numbers.factorial(1)!=1) return false;
		if(Numbers.factorial(5)!=120) return false;
		if(Numbers.factorial(20)!=-2102132736) return false;  //recursion check
		if(Numbers.factorial(-2)!=1) return false;  //error handling check
		return true;
	}
/*
	static boolean summationTest() {
	if(Numbers.summation(5)!= 15) return false;
	if(Numbers.summation(0)!= 0) return false;
	return true;
	}

	static boolean fibonacciTest(){
		if(Numbers.fibonacci(0)!=0) return false;
		if(Numbers.fibonacci(1)!=1) return false;
		if(Numbers.fibonacci(6)!=8) return false;
		return true;
	}
	static boolean sumDigitsTest(){
		if(Numbers.sumDigits(1)!=1) return false;
		if(Numbers.sumDigits(3)!=3) return false;
		if(Numbers.sumDigits(12)!=3) return false;
		if(Numbers.sumDigits(27)!=9) return false;
		return true;
	}
	static boolean productDigitsTest(){
		if(Numbers.productDigits(5)!=5) return false;
		if(Numbers.productDigits(9)!=9) return false;
		if(Numbers.productDigits(23)!=6) return false;
		if(Numbers.productDigits(54)!=20) return false;
		return true;
	}
	static boolean productTest(){
		if(Numbers.product(4,0)!=0) return false;
		if(Numbers.product(2,3)!=6) return false;
		if(Numbers.product(4,6)!=24) return false;
		return true;
	}
	static boolean sumRangeTest(){
		if(Numbers.sumRange(4,4)!=4) return false;
		if(Numbers.sumRange(3,5)!=12) return false;
		if(Numbers.sumRange(2,4)!=9) return false;
		return true;
	}
	static boolean reverseDigitsTest(){
		if(Numbers.reverseDigits(23)!=32) return false;
		if(Numbers.reverseDigits(573)!=375) return false;
		if(Numbers.reverseDigits(7)!=7) return false;
		return true;
	}

	static boolean gcdTest(){
		if(Numbers.gcd(5,10)!=5) return false;
		if(Numbers.gcd(12,8)!=4) return false;
		if(Numbers.gcd(4,4)!=4) return false;
		if(Numbers.gcd(1,5)!= 1) return false;
		return true;
	}

	static boolean sqrtNewtonTest(){
		if(Math.abs(Numbers.sqrtNewton(36,.0000000001) - 6) >= .00000001)return false;
		if(Math.abs(Numbers.sqrtNewton(144,.00001) - 12) >= .01) return false;
		if(Math.abs(Numbers.sqrtNewton(64, .000000000001)-8) >= .0000001) return false;
		return true;	
	}	



	static boolean sqrtBisectionTest(){
	    if(Math.abs(Numbers.sqrtBisection(36,.0000000001) - 6) >= .00000001)return false;
	    if(Math.abs(Numbers.sqrtBisection(25,.0000000001) - 5) >= .00000001)return false;
		  if(Math.abs(Numbers.sqrtBisection(144,.00001) - 12) >= .01) return false;
		  if(Math.abs(Numbers.sqrtBisection(64, .000000000001)-8) >= .0000001) return false;
		 	return true;
	 }

	static boolean combinationTest(){
			if(Numbers.combinations(5, 2)!=10) return false;
			if(Numbers.combinations(4, 3)!=4) return false;
			if(Numbers.combinations(0, 2)!=0) return false;
			if(Numbers.combinations(7,5)!=21) return false;
			return true;
	}

	static boolean compoundTest(){
		if(Numbers.compound(3,4,0)!=0) return false;
		if(Numbers.compound(1,2,1)!=3) return false;
		if(Numbers.compound(3,2,2)!= 27) return false;
		return true;
}
*/
}
