package assignment2;

public class Node<T> {
	private T data;
	private Node<T> nextNode;
	private Node<T> nodeBefore;
	
	public Node(T data) {
		this.data=data;
		nextNode=null;
		nodeBefore=null;
	}
	public T getData() {
		return data;
	}

	public void setNextNode(Node<T> node) {
		nextNode=node;
	}
	
	public void setNodeBefore(Node<T> node) {
		nodeBefore=node;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public Node<T> getNodeBefore(){
		return nodeBefore;
	}
	
}
