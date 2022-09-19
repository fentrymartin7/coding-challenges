import java.util.regex.*;  
public class Main {
	public static void main(String[]args) {
		String s1 = "121317";
		String s2 = "1234";
		String s3 = "45135";
		String s4 = "89abc1";
		String s5 = "900876";
		String s6 = " 4983";
		String s7 = "";
		
		System.out.println(s1 + " is "+ validate(s1));
		System.out.println(s2 + " is "+ validate(s2));
		System.out.println(s3 + " is "+ validate(s3));
		System.out.println(s4 + " is "+ validate(s4));
		System.out.println(s5 + " is "+ validate(s5));
		System.out.println(s6 + " is "+ validate(s6));
		System.out.println(s7 + " is "+ validate(s7));
	}
	
	public static boolean validate(String pin) {
		if(Pattern.matches("[0-9]{4}", pin) || Pattern.matches("[0-9]{6}", pin))
			return true;
		return false;
	}
}
