package hq.c3p0.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PNumber {
	
		public static boolean isNumeric(String str) {
			Pattern pattern = Pattern.compile("[0-9]*\\.?[0-9]*");
			Matcher isNum = pattern.matcher(str);
			if (!isNum.matches()) {
				return false;
			}
			return true;
		}
}
