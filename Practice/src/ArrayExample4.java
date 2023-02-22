// equals() for Non-Primitive type
import java.util.Arrays;

public class ArrayExample4 {

	public static void main(String[] args) {
		Integer a[]= {10,20,null, 40};
		Integer b[]= {10,20,null,40};
		if(Arrays.equals(a, b))
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
	}

}
