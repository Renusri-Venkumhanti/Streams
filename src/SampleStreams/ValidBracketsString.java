package SampleStreams;
import java.util.*;

public class ValidBracketsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String braces1 = "{}[]()";
	        String braces2 = "{[}]";
	        String braces3 = "{{}}[([)])]";
	        System.out.println(isValidString(braces1)); // true
	        System.out.println(isValidString(braces2)); // false
	        System.out.println(isValidString(braces3)); // true

	}
	public static boolean isValidString(String input) {
		Stack<Character> stack= new Stack<>();
		for(char braces: input.toCharArray()) {
			if(braces =='(' || braces=='{'|| braces=='[') {
				stack.add(braces);
			}else {
				if(stack.isEmpty())
					return false;
				if(braces==')'&& stack.peek()!='(')
					return false;
				else if (braces=='}'&& stack.peek()!='{')
					return false;
				else if (braces==']'&& stack.peek()!='[')
					return false;
				stack.pop();
			}
		}
		int mask = 0x000F;
		int value = 0x2222;
		System.out.println(value&mask);
		try {
		Float f = new Float("3.0");
		int x = f.intValue();
		byte b = f.byteValue();
		double d = f.doubleValue();
		System.out.println(x+b+d);
		}catch(NumberFormatException e) {
			System.out.println("bad");
		}
		return stack.isEmpty();
	}

}
