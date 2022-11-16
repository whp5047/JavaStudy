package JavaDataStructure.Collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

// 내림차순으로 재정의
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)* (-1);
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare()); // () 안에 비교할 것 추가로 작성해주기
		
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set); 
		
		
		
	}

}
