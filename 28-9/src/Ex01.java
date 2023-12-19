import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input a acharacter, check if it lower case or not
		System.out.printf("Enter a character: ");
		char ch = new Scanner(System.in).next().charAt(0);
		int flag = Utility.isLower(ch);
		if (flag == 1){
			ch = (char) (ch+3);
		}else if (flag == 0){
			ch = (char) (ch-3);
		}
		System.out.println("Result = " +ch);
	}
	/*
	 	Components a function:
	 	1.Function name: is Lower() - registerACourse()
	 						is_Lower
	 	2.List of parameters:
	 		Input of the function
	 	3.return type:
	 		data type of the expected output
	 */
		flag = Utility.isLower;

}
