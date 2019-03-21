public class ArrayQueue<T> implements Queue<T> {
	protected T [] arr;
	protected int head;
	protected int tail;
	protected int size = 10; //default size

	public ArrayQueue() {
		head = 0;
		tail = 0;
		arr = (T[]) new Object[size]; //initialize the array
	}

	public boolean empty() { 
		if(head==tail) {
			return true;
		}
		return false;		
	}

	public T dequeue() {
		if(empty()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("empty");
			}
		}// in case there are no thing to dequeue
		T temp = arr[head];
		head = (head+1)%arr.length; // remove the old head from queue
		return temp;
	}

	public void enqueue(Object t) {
		if(tail+1==arr.length) {
			grow_array();
		} // grow array when the array is full
		arr[tail]= (T) t; // add new queue 
		tail = (tail+1)%arr.length;
	}

	public void grow_array() {
		T [] temp = (T[]) new Object[arr.length*2];
		for(int i = 0;i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

}