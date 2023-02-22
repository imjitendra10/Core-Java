
public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="!ya_h*@o%o";
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
