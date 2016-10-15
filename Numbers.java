/**
 * Recursion Assignment
 * @author 
 *
 * Remove the NotImplemented line from any methods you write
 * DO NOT change the method signatures
 * You MAY write helper classes
 */

import java.lang.Math;

public class Numbers {
	
	/*
	 * #N0 Factorial (0pt)
	 * F(n ) = n * F(n-1)     (if n > 0)
	 * F(0) = 1
	 */
	static int factorial(int num) {
		if(num<=0) return 1;
		return num * factorial(num-1);
	}
	
	/*
	 * #N1 Summation (1pt)
	 * S(n ) = n + S(n-1)     (if n > 0)
	 * S(0) = 0
	*/
	static int summation(int n) {
	if (n==0) return 0;
	return n + summation(n-1);
	}
		
	/*
	 * #N2 Fibonacci (1pt)
	 * F(0) = 0
	 * F(1) = 1
	 * F(n ) = F(n-1) + F(n-2) (if n > 0)
	 */
/*
static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/*
	 * #N3 Sum of a number's digits (1pt)
	 * S(n ) = n					(if n < 10)
	 * S(n ) = S(n/10) + n mod 10   (if n>= 10)
	*/
/*	static int sumDigits(int n) {
		if(n<=10) return n;
		return sumDigits(n/10) + n%10;

	}
	
/*	/*
	 * #N4 Product of a number's digits (1pt)
	 * S(n ) = n					(if n < 10)
	 * S(n ) = S(n/10) * n mod 10   (if n>= 10) 
	 */
/*	static int productDigits(int n) {
		if(n<=10)return n;
		return productDigits(n/10)*(n%10); 

}
	
	/*
	 * #N5 Product of two whole numbers (1pt)
	 * P(a,b) = a + P(a,b-1)        (if b > 0)
	 * P(a,0) = 0
	 */
/*	static int product(int a, int b) {
		if(b==0) return 0;
		return a + product(a,b-1);
	}
	
	/*
	 * #N6 Sum over a range of numbers (1pt)
	 * S(a,b) = a				(if a = b)
	 * S(a,b) = b + S(a,b-1)
	 */
/*	static int sumRange(int a, int b) {
		if(a==b) return a;
		return b + sumRange(a,b-1);
	}
	
	
	/*
	 * #N7 Reverse a number's digits (2pt)
	 * R(n,v) = n + 10 * v				  (if n < 10)
	 * R(n,v) = R(n/10, 10*v + n mod 10))
	 * (v begins at 0)
	 */
	/*	static int reverseDigits(int n) {

			int reverse = 0;
			System.out.println("reverse:" + reverse);
			int length = length(n);
			System.out.println("length:" + length);
		
			if(length==1){
			  return n;
			}
		  System.out.println("n is:" + n);
			int baseOfTen = length-1;
			System.out.println("baseOfTen:" + baseOfTen);

			int powerOfTenForMult = (int)Math.pow(10, baseOfTen);
			System.out.println("powerOfTenForMult:" + powerOfTenForMult);
			
			int powerOfTenForMod = (int)Math.pow(10, baseOfTen-1);
			System.out.println("powerOfTenForMod:" + powerOfTenForMod );
			int lastDigit = n%10;
			System.out.println("lastDigit:" + lastDigit);
			int newNumber = lastDigit*powerOfTenForMult;
			System.out.println("newNumber:" + newNumber);
			 int recurseNumber = n/10;
			System.out.println("recurseNumber:" + recurseNumber);
		 
		 reverse = reverse + newNumber + reverseDigits(recurseNumber);
			System.out.println("reverse:" + reverse);



/*	int reverse = n;
		if(n<10) return ;
		return reverseDigits(10*secondDigit(n) + n%10);


*/
/*return reverse; }
	
	static int length(int n){
	int exponent = 0; 
	while(true){
		int poweroften = (int)Math.pow(10, exponent);
		int valueDivision = n/poweroften;
/*		System.out.println("exponent" + exponent);
		System.out.println("power of ten" +  poweroften + "value division:" + valueDivision);*/
	/*	if(valueDivision>0){
			exponent++;
		}
		else return exponent;
	}
	}

	
	/*
	 * #N8 Euclid's Algorithm for GCD (2pt)
	 * GCD(x,y) = y                 (if y <= x & x mod y=0)
	 * GCD(x,y) = GCD(y,x mod y)
	 */
/*	static int gcd(int x, int y) {
		if(y <= x && x%y==0){
			return y;
		}
		else return gcd(y, x%y);
	}
	
	/*
	 * #N9 Compound interest balance (2pt)
	 * B(p,r,t) = P                (if t = 0)
	 * B(p,r,t) = (1+r)*B(p,r,t-1)
	 */
	/* static double compound(double p, double r, int t) {
		if(t==0){
			return p;
		}
		else return (1+r)*compound(p,r,t-1); //write test case
	}
	
	/*
	 * #N10 Newton's algorithm for square root (3pt)
	 * SR(n,p,e) = e				 (if | e^2 - n | < p)
	 * SR(n,p,e) = SR(n,p,(e+n/e)/2)
	 * (e begins at n)
	 */
/*	static double sqrtNewton(double n, double p) {//p = error return; if the answer is close to the actual answer, p will be small
		double e = n;
		return sqrtNewtonRecursive(n, p, e);
	
	}
	
	static double sqrtNewtonRecursive(double n, double p, double e){
		if(Math.abs(Math.pow(e,2) - n)<p){
			return e;
		}
		else {
			return sqrtNewtonRecursive(n, p, (e+n/e)/2);
		}
	}
	/*
	 * #N11 Bisection method for square root (3pt)
	 * SR(n,p,h,l) = e				(if | e^2 - n | <= p)
	 * SR(n,p,h,l) = SR(n,p,e,l)    (if e^2 > n)
	 * SR(n,p,h,l) = SR(n,p,h,e)    
	 * (where e=(h+l)/2, h begins at n, and l begins at 0)
	 */
/*	static double sqrtBisection(double n, double p) {
		double h = n;
		double l = 0;
		return sqrtBisectionRecursive(n, p, h, l);
	}

	static double sqrtBisectionRecursive(double n, double p, double h, double l){
		double e = (h+l)/2;
		if(Math.abs(Math.pow(e,2) - n) <= p){
			return e;
		}
		else if(Math.pow(e,2)>n){
			return sqrtBisectionRecursive(n, p, e, l);
		}
		else{
			return sqrtBisectionRecursive(n, p, h, e);
		}
	}
	
	/*
	 * #N12 Combinations (2pt)
	 * C(n,k) = n			(if k = 1)
	 * C(n,k) = 0			(if k > n)
	 * C(n,k) = 1			(if k = n)
	 * C(n,k) = C(n-1,k) + C(n-1,k-1)
	 */
	/*static int combinations(int n, int k) {
		if(k==1){
			return n;
		}
		else if(k>n){
			return 0;
		}
		else if(k==n){
			return 1;
		}
		else{
			return combinations(n-1,k) + combinations(n-1,k-1);
		}
	
}
*/
	
}
