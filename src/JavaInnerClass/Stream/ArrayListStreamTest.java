package JavaInnerClass.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();//Collection은 전부 Stream으로 가능
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s +"\t"));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n +"\t"));
		System.out.println();
		sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
		
		
	}

}
