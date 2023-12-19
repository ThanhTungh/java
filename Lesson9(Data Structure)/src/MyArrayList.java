
public class MyArrayList <T>{ //generic class <T>

		// TODO Auto-generated method stub
		private Object[]arr;
		private final int DEFAULT_CAPACITY = 10;
		private int capacity;
		private int size;
		
		public MyArrayList() {
			arr = new Object[DEFAULT_CAPACITY];
	        this.capacity = DEFAULT_CAPACITY;	
		}
		public int size() {
		    return size;
		}
		
}
	