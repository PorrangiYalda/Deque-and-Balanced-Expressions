package assignment2;
/**
 * 
 * implements the DequeInterface methods
 * removeBack and removeFront have an additional check for when entries are 0 to handle the case
 * without getting a NullPointerException
 */
public class MyDeque<T> implements DequeInterface<T> {
	  Node<T> firstNode;
	  Node<T> lastNode;
	  Node<T> temp;
	  Node<T> newNode;
	  int entries=0;
	  
	  public MyDeque() {
		  firstNode=null;
		  lastNode=null;
	  }
	@Override
	public void addToFront(T newEntry) {
		newNode=new Node<T>(newEntry);
		if(entries==0) {
		firstNode=newNode;
		lastNode=firstNode;
		}else {
			temp=firstNode;
			firstNode.setNodeBefore(newNode);
			firstNode=newNode;
			firstNode.setNextNode(temp);
			
		}
		
		entries++;
		
	}

	@Override
	public void addToBack(T newEntry) {
		newNode=new Node<T>(newEntry);
		
		if(entries==0) {
			lastNode=newNode;
			firstNode=lastNode;
			}else {
				temp=lastNode;
				lastNode.setNextNode(newNode);
				lastNode=newNode;
				lastNode.setNodeBefore(temp);
			}
		
		
		entries++;
		
	}

	@Override
	public T removeBack() {
		if(entries==0||firstNode==null) {
			System.out.println("nothing to remove");
			return null;
		}
		temp=lastNode;
		
	    if(entries==1) {
	    	lastNode=null;
	    	firstNode=lastNode;
	    	entries--;
	    	return temp.getData();
	    	
	    }
	
		lastNode=lastNode.getNodeBefore();
			if(lastNode!=null) {
			lastNode.setNextNode(null);
		
		}
		
		if(lastNode==null) {
			firstNode=null;
		}
		entries--;
		
		return temp.getData();
	}
	
	@Override
	public T removeFront() {
	    if (entries == 0||firstNode==null) {
	        System.out.println("nothing to remove");
	        return null;
	    }
	    temp=firstNode;
	    if(entries==1) {
	    	firstNode=null;
	    	lastNode=firstNode;
	    	entries--;
	    	return temp.getData();
	    	
	    }
	  
	    temp = firstNode;
        firstNode = firstNode.getNextNode();
       	firstNode.setNodeBefore(null); 
	       
	    entries--;
	   
	    return temp.getData(); 
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		if(firstNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		return firstNode.getData();
	}

	@Override
	public T getBack() {
		// TODO Auto-generated method stub
		if(lastNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		return lastNode.getData();

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return entries==0;
	}

	@Override
	public void clear() {
		firstNode=null;
		lastNode=null;
		entries=0;
		
	}

}
