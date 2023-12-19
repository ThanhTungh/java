
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{4, 4, 4, 4},
				{9, 3, 2},
				{}
		};
		for(int i=0; i<arr.length; i++) {
			System.out.println("Mark of the student " + (i+1) + " is: ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
