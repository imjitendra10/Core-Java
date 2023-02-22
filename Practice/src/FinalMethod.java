
 public class FinalMethod {
	final void show() {
		System.out.println("Show the details");
	}
}
 class A extends FinalMethod{
	// void show () {    
	//	 System.out.println("Display the details");
	// }
	 public static void main(String args[]) {
		 A ref = new A();
		 ref.show();
	 }
	 
 }
