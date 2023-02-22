public class FinalVariable {
	final int a = 20;

	 void show() {
	//	a = 30; Final variable can not be assigned 
		System.out.println("final variable");
	}

	public static void main(String[] args) {
		FinalVariable ref = new FinalVariable();
		ref.show(); // CTE

	}

}
