package JavaInnerClass.IOStream;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'F', 'G'};
			
			fw.write(buf); // 배열출력
			fw.write("안녕하세요. 잘 써지네요."); //스트링 출력
			fw.write(buf, 1, 2); // 문자배열의 일부 출력
			fw.write("65");// 숫자 그대로 출력 
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("출력이 완료되었습니다.");
		
	}

}
