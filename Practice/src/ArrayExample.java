import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30}; // If we change any value it will return false
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.toString(b));

	}

}
