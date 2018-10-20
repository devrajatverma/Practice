package regex;
import java.util.regex.Pattern;

public class Split {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile("[ ,.!]");
		String str[] = pat.split("one two,alpha9 12!done");
		for (String s : str)
			System.out.println(s);
	}

}
