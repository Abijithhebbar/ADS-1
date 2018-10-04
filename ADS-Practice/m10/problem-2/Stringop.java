class Stringop {
	public String check(String str) {
		String s = "";
		if (str.charAt(0) == str.charAt(1)) {
			s = str.charAt(0) + "*" + str.charAt(1);
			return check(str.substring(1), str);
		} else {
			return check(str.substring(1), str);
		}
		return "*" +s + "*";

	}
	public String check(String str,  String s) {

	}
}