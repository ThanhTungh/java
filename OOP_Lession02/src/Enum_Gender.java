
public class Enum_Gender {
	public static byte MALE = 1;
	public final static byte FEMALE = 2;
	public final static byte OTHERS = -1 ;
	
	public static byte generate() {
		return (byte)(new java.util.Random().nextInt(3) - 1);
		
	}
	public void test() {
//		Enum_Gender.MALE = 2;	
	
	}
}
