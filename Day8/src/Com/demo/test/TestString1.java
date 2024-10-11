package Com.demo.test;

public class TestString1 {

	public static void main(String[] args) {
		String s1="test";
		//String s2=s1;
		String s3="test";
		String s4=new String ("test");
		System.out.println("s1==s2"+(s1==s3));
		System.out.println("s1==s4"+s1==s4);
		//System.out.println("s1==s2"+s1==s2);
		//System.out.println("s2==s3"+s2==s3);
		System.out.println("s1==s3"+s1.equals(s3));
		System.out.println("s1==s4"+s1.equals(s4));

	}

}
