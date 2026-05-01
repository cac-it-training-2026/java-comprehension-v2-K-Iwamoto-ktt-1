package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();

		Member miura = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member sato = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(miura);
		members.add(sato);

		System.out.println("===会員情報を表示します=== ");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		try {
			System.out.println("input target id>>");
			int inputId = cr.inputNumber();
			System.out.println("input new password>>");
			String inputPassword = cr.inputString();

			MemberManager.updatePassword(members, inputId, inputPassword);

		} catch (IOException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
