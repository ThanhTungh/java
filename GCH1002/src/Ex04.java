import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String n = scn.nextLine();
		int result = 0;
		for(int i=n.length()-1; i>=0; i--) {
			result = result*10 + Character.getNumericValue(n.charAt(i));
			
		}
		char[] ch = n.toCharArray();
		for(int i=0; i<=ch.length/2; i++) {
			char temp = ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-1-1] = temp;
		}
		String n_start = new String(ch);
		int result1 = Integer.parseInt(n_start);
		System.out.println("Result = " + (result1*result1));	

}
}


