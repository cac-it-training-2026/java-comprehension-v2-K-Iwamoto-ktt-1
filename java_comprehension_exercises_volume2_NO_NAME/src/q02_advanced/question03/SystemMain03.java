package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;

		ConsoleReader cr = new ConsoleReader();
		MemberStorage memberStorage = new MemberStorage();
		LoginService ls = new LoginService(memberStorage);
		Member member = null;

		while (!isLogin) {
			try {
				System.out.println("input target id>>");
				int inputId = cr.inputNumber();
				System.out.println("input new password>>");
				String inputPassword = cr.inputString();
				member = ls.doLogin(inputId, inputPassword);

			} catch (IOException e) {
				System.out.println("不正な入力です。再度入力してください。");
				continue;
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください。");
				continue;
			}

			if (member == null) {
				System.out.println("ID またはパスワードが違っています。再度入力してください。");
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		member.showMember();

	}

}
