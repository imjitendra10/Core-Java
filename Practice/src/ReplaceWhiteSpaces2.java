
public class ReplaceWhiteSpaces2 {

	public static void main(String[] args) {
		String str=" Ji  te n d   ra   ";
		String string= str.trim();
		String s= str.replaceAll("\\s", ""); //(\\s) unique code value that represent single space
		
		System.out.println(s); // remove all spaces
		System.out.println(string); // remove start and end spaces
		System.out.println(str); // print same as given string
	
	}

}
