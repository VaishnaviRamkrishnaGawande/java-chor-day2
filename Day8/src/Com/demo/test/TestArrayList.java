package Com.demo.test;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> lst= new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		//give the position of given index
		System.out.println("Index position : "+lst.indexOf(20));
		//contain gives the true false value if the value is available in the array then it
		//gives true otherwise false
		System.out.println("Contains : "+lst.contains(40));
		System.out.println("Contains : "+lst.contains(30));
		List<Integer> lst2= List.of(11,22,33,44,55,66,77,88,99);
		//stream=fast execution like forEach
		lst2.stream().forEach(System.out::println);

		

	}

}
