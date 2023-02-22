//equals() 2nd version

import java.util.Arrays;

public class ArrayExample5 {

	public static void main(String[] args) {
		Integer a[]= {10,20,30,40,60};
		Integer b[]= {30,40,60,15,35};
		if(Arrays.equals(a,2,5, b,0,3))
		//	boolean equals(a[],aStart,aEnd,b[], bStart,bEnd)
		// in Java start index always inclusive and end index always exclusive	
			
			System.out.println("Yes");
		else {
			System.out.println("No");
		}

	}

}
