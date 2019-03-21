public class ArrayStack<T> implements Stack<T> {
	protected T [] arr;
	protected int top;
	protected int size = 10;

	public ArrayStack() {
		top = -1;
		arr = (T[]) new Object[size]; // initialize the array
	}
	public T pop() {
		if(empty()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("empty");
			}
		}
		return arr[top--];//return the value of top and pop it
	}
	public T peek() {
		if(empty()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("empty");
			}
		}
		return arr[top];// return the value of top
	}
	public void push(Object t) {
		if(top==arr.length-1) {
			grow_array();
		}
		arr[++top] = (T) t;//add new stack on the top
	}
	public void grow_array() {
		T [] temp = (T[]) new Object[arr.length*2];
		for(int i = 0;i < arr.length; i++) {
			temp[i] = arr[i];
		}// double the size of the array
		arr = temp;
	}

	public boolean empty() {
		if(top==-1){
			return true;
		}
		return false;
	}
}


















