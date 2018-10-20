package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {

	public static void main(String[] args) {
		Matcher mat = Pattern.compile("[W,w]+").matcher("w w w");
		while(mat.find())
			System.out.println(mat.group());

	}

}
