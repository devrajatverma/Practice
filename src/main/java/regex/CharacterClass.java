package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
	public static void main(String[] args) {
		String str = "Jon Jonthan Frank Todd";
		Matcher mat = Pattern.compile("Jon.*? ").matcher(str); //also try with "Jon.* "
		System.out.println("original sequence: "+ str);
		str = mat.replaceAll("Eric ");
		System.out.println("Modified sequence: "+ str);
		
		System.out.println(Pattern.matches("java", "java"));
		System.out.println("java".matches("java"));
	}
}
