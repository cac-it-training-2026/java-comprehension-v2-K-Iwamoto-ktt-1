package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];

		Member miura = new Member(1, "Pass0rd", "Miura Manabu", 28, 2);
		Member sato = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		members[0] = miura;
		members[1] = sato;

		MemberManager.showAllMembers(members);

	}

}
