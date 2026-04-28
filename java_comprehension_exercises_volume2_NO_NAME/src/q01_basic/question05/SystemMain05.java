package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		NonMember sato = new NonMember("Sato Kensuke");
		Member miura = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		members[0] = sato;
		members[1] = miura;

		MemberManager.showAllMembers(members);
		sato.buyItem();
		miura.buyItem();

	}

}
