
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int k = (n%2==0) ? n/2 : (n/2+1);
		for (int i =1; i<=k; i++){//Di lan luot tung hang voi moi hang ta in'n' ngoi sao
			print(i, n);
		}
		for (int i=n/2; i>=1; i--) {
			print(i, n);
		}
	}	
	private static void print(int i , int n) {
			for(int j=0; j<n;j++) {
				if(j>i && j<n-i)
					System.out.print("  ");
				else
					System.out.print("* ");
				}
				System.out.println();
		}
	}


