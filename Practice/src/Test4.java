// comapreTo() in string

public class Test4 {

	public static void main(String[] args) {
		String s1="AllisWell";
		//String s2= "Back";
		String s3="AllisWell";
		int res=s1.compareTo(s3);
		if(res==0)
			System.out.println("Same");
		if(res>0)
			System.out.println("s1 greater");
		if(res<0)
			System.out.println("s1 smaller");
	}

}
