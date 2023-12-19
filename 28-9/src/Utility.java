
public class Utility {
	static int isLower(char ch) {
		if(ch >= 'A' && ch <= 'Z')
	    {
			return 1;
	    }
	    else if(ch >= 'a' && ch <= 'z')
	    {
	    	return 0;
	    }
	    else
	    {
	    	System.out.println("not an alphabet.");
	    }
		return -1;
	}

}
