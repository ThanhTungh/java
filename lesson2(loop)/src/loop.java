
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0; i<=10; i++) {
//			if(i==5) 
//				continue;
//			System.out.print(i);
//		}
//		System.out.println("Bye");
		int i = 1;
		while(i <=10) {	
			if(i==5) {	
				i++;
				continue;
			}
			System.out.print(i);
			i++;	
		}
		System.out.println("Bye");
		
		
		
		
		
	}
}
