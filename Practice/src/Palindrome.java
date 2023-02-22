
public class Palindrome {

	public static void main(String[] args) {
		int num = 569, rem, temp, rev = 0;

		temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");

		}
	}
}
