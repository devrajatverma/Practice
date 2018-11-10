package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three {

	public static void main(String[] args) {
		Matcher mat = Pattern.compile("e.+d").matcher("extend cup end table");
		while(mat.find())
			System.out.println(mat.group());

		// By default find matches longest sequence called greedy behavior
		// to specify reluctant behavior add ? quantifier to the pattern
		
		mat = Pattern.compile("e.+?d").matcher("extend cup end table");
		
		while(mat.find())
			System.out.println(mat.group());
	}

}
