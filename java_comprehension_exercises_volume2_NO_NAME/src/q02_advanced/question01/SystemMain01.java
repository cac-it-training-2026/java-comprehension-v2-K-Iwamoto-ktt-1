package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");

		Member miura = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member sato = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		miura.showMember();
		sato.showMember();

	}

}
