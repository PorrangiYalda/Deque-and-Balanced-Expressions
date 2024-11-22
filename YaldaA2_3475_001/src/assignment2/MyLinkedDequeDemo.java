package assignment2;
/**
 * this class demonstrates DequeInterface methods
 */
public class MyLinkedDequeDemo {
	public static void main(String[] args) {
		MyDeque<Integer> deque = new MyDeque<Integer>();
		deque.addToFront(10); 
		//deque.addToFront(40); 
		deque.addToBack(20);   
        deque.addToFront(30);  
        
        System.out.println("Front: " + deque.getFront());  
        System.out.println("Back: " + deque.getBack());    
        
        // Remove 
        deque.removeFront();   
        deque.removeBack();    
        
        System.out.println("After removing:");
        System.out.println("Front: " + deque.getFront());  
        System.out.println("Back: " + deque.getBack());    
        
        // Check if empty
        System.out.println("Is empty? " + deque.isEmpty());  // Outputs false
        deque.removeFront();  // Removes 10
        System.out.println("Is deque empty after removal? " + deque.isEmpty());  // Outputs true
        
        // Clear the deque
        deque.clear();
        System.out.println("Is deque empty after clear? " + deque.isEmpty());  // Outputs true
		
	}

}
