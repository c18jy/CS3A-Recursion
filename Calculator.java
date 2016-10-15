/* 
 * #C1 Calculator (7pt)
 * implement a calculator that takes a char[] and returns a value 
 * 
 * Should handle +, /, -, *, e, and m 
 * (e for exponentiation, m for modulo)
 * 
 * Should handle unlimited correctly matched parenthesis
 * 
 * example input:
 * 
 * input: (3+4)
 * value: 7.0
 * 
 * input: (((4+6)*2)*(4-2))
 * value: 20.0
 * NOTE: My program can only handle FULLY PARENTHESIZED problems.  
 */

import java.util.*;


public class Calculator {


	public static void main(String[] args) {
		System.out.println("calculator " + (calcTest()?"Passed":"Failed"));
	}

	/*
	 * TEST
	 */
	static boolean calcTest() {
		System.out.println(calc("((3+4)*2)".toCharArray()));
		System.out.println(calc("((10+10)*3)".toCharArray()));
		System.out.println(calc("(2e3)".toCharArray()));
		System.out.println(calc("(12m10)".toCharArray()));
	
		if(calc("(2e3)".toCharArray())!=8.0) return false;
		if(calc("(12m10)".toCharArray())!=2) return false;
		if(calc("((3+4)*2)".toCharArray())!=14.0) return false; 
		if(calc("((10+10)*3)".toCharArray())!=60.0) return false; 
		return true; 
	}
	

	static String[] tokenizer(char[] exp){ //tokenizer that condenses single char digits next to each other into the single number they are supposed to represent
		ArrayList<String> tokens = new ArrayList<String>();
		for(int i = 0; i < exp.length; i++){
		  if(Character.isLetter(exp[i]) || !Character.isLetterOrDigit(exp[i])){ //if anything except for Digit
				tokens.add("" + exp[i]);
			}else{
				String num = ""; 
				while(i<exp.length && Character.isDigit(exp[i])){ //while expression length greater than I & character is a digit
				    num = num + exp[i];
						i++;
				}
				tokens.add(num); //add to tokens array
				if(i<exp.length && !Character.isDigit(exp[i]))
					i--;
			}
		}
		String[] tokensArray = new String[tokens.size()]; 
	  return tokens.toArray(tokensArray); //tokens to array
	}

	static double calc(char[] expr) {
		      String[] tokens = tokenizer(expr);//uses tokenizer
					for(int i = 0; i < tokens.length; i++){
						System.out.println(tokens[i]);
					}
				  Stack<String> ops  = new Stack<String>(); //stack for operators
				  Stack<Double> vals = new Stack<Double>(); //stack for values & to hold intermediate values
					int pos = 0;
					while (pos < tokens.length) {
							String s = tokens[pos];
						  if(s.equals("(")) ;
						  else if (s.equals("+"))   //each operator case
								ops.push(s);				
							else if (s.equals("-"))   
								ops.push(s);
							else if (s.equals("*"))   
								ops.push(s);
							else if (s.equals("/"))   
								 ops.push(s);
					    else if (s.equals("m"))
								ops.push(s);
							else if (s.equals("e"))
								ops.push(s);
							else if (s.equals(")")) {																									        
								String op = ops.pop();
								double v = vals.pop();
								if(op.equals("+"))   
									v = vals.pop() + v;
								else if (op.equals("-"))   
									v = vals.pop() - v;
							  else if (op.equals("*"))    
									v = vals.pop() * v;
							  else if (op.equals("/"))   
									v = vals.pop() / v;
								else if (op.equals("m"))
									v = vals.pop() % v;
								else if (op.equals("e"))
									v = Math.pow(vals.pop(), v);
		            vals.push(v);			
					    }
							else{
								vals.push(Double.parseDouble(s)); //push onto vals stack
							}
							
					    pos++;
					}
				  return vals.pop(); //pop from vals array
			}
}





