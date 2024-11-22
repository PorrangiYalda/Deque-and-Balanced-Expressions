package assignment2;
import java.util.Scanner;
/**
 * this class takes an expression and checks if it's balanced or not
 * same as IfBalanceExp 
 */
import java.util.HashMap;

public class CheckBalance {
	
	public static void main(String[] args) {
		MyDeque<Character> myDeque = new MyDeque<Character>();
		/**
		 * maps each opening delimiter with its respective closing
		 */
		HashMap <Character,Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(',')');
		char key;
		char value;
		boolean noDelimiter=true;
		
		System.out.println("enter an expression: ");
		Scanner scanner=new Scanner(System.in);
		String input =scanner.nextLine();
		scanner.close();
		
		char[] arr=input.toCharArray();
		
		for(int i=0;i<arr.length;++i) {
			
		if(isOpeningDelimiter(arr[i])) {
			noDelimiter=false;
		myDeque.addToFront(arr[i]);
		
		}else if(isClosingDelimiter(arr[i])) {
			//if is closing -> get front , if match pop if not exception
			noDelimiter=false;
			key=myDeque.getFront();
			value=map.get(key);
			if(arr[i]==value) {
				myDeque.removeFront();
				
			}else {
				System.out.println("not matching delimiters found: "+arr[i]+" does not match "+key);
				break;
			}
			
		}
		
		}//end of for loop
		if(noDelimiter) {
			System.out.println("cannot check for balance because your expression has no delimiters");
		}
		else if(myDeque.isEmpty()) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
		}//end of class
	
	
		public static boolean isOpeningDelimiter(char in) {
		if(in=='{'||in=='('||in=='[') {
		return true;
		}
		return false;
		}
		
		public static boolean isClosingDelimiter(char in) {
			if(in=='}'||in==')'||in==']') {
			return true;
			}
			return false;
		
	}

}
