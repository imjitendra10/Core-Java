
public class ReverseString2 {

	public static void main(String[] args) {
		String str = "Hello";
		/*
		 * int i= str.length(); while(i>0) { System.out.println(str.charAt(i-1)); i--; }
		 */
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
