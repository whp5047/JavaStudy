package JavaClass.String;

public class StringTextBlock {

	public static void main(String[] args) {
		//java13 ���� �̻���� ����
		String textBlock = """
						Hello,
						hi,
						how r u""";
								
		System.out.println(textBlock);		
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
		
					<body>
						<span>example text</span>
					</body>
				</html>""";
				
	}
	
	
}
