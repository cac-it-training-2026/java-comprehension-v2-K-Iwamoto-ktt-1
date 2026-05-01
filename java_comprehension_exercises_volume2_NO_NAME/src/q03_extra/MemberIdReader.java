package q03_extra;

public class MemberIdReader implements IConsoleReader {

	public String setErrorMsg() {
		return "1-9の整数を入力してください";

	}

	public boolean isValid(String inputString) {
		boolean answer;

		if (inputString.equals("[1-9]")) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;

	}

	public boolean isParseInt() {
		return true;
	}

}
