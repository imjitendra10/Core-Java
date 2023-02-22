import java.util.Arrays;

//binarySearch(), it works only for sorted Array
public class ArrayExample2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		System.out.println(Arrays.binarySearch(arr,20));
		System.out.println(Arrays.binarySearch(arr, 0,3,30));
		
		// to get the index of the value which are  not present in array -(insertion point+1)
		System.out.println(Arrays.binarySearch(arr, 35)); 
		
			}

}
