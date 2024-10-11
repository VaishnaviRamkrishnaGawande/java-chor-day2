package Com.demo.test;

public class TestString2 {

	public static void main(String[] args) {
		String s1="Vaishnavi";
		s1=s1.concat("shin");
		s1=s1.concat("de");
		System.out.println(s1);
		
		s1=s1.replace("n","i");
		System.out.println(s1);
		
		StringBuilder sb= new StringBuilder("Vaishnavi Shinde \t");
		sb.append("is a good girl");
		System.out.println(sb);
		
		String s11 = "Rinki,Shinde,Vaish-shinde";
		s11.split(",");
		System.out.println(s11);

		
		
		s1="xxx,yyy,zzz-rrr";
		String[] arr=s1.split(",");
		String s3="aaaa";
		String s2=s3.join("*~*", arr);
		System.out.println(s2);
		//String s111="Happy Life";
		
	}

}
