//equals() primitive type
import java.util.Arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]= {10,20,25};
		if(Arrays.equals(a,b))
			System.out.println("Yes");
		else {
			System.out.println("No");
			
		}
		if(Arrays.equals(a, c))
			System.out.println("Yes It is equal");
		else {
			System.out.println("No it is not equal");
		}
	}

}
