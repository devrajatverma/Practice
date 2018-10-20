package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		pat = Pattern.compile("test");
		mat = pat.matcher("test 1 2 3 test");
		while(mat.find()) {
			System.out.println(mat.start());
			System.out.println(mat.end());
		}
	}
}