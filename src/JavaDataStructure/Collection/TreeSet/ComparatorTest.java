package JavaDataStructure.Collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

// ������������ ������
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)* (-1);
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare()); // () �ȿ� ���� �� �߰��� �ۼ����ֱ�
		
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set); 
		
		
		
	}

}
