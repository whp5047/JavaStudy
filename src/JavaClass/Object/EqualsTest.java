package JavaClass.Object;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std2;
		
		System.out.println(std1 == std2); // 주소값이 같은지
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println("std1 : " +System.identityHashCode(std1));
		System.out.println("std2 : " +System.identityHashCode(std2));
		

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
		std1.setStudentName("Kim"); // Lee를 Kim으로 수정 후 아래에 클론을 할 시 원본이 변경되어 같이변경된 것을 확인할 수 있음
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent.toString()); // class에 implement clonealbe 추가해줘야 가능
		
		
	}

}
