package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		Member nullMember = new Member();
		Member miura = new Member("Miura Manabu", 28, 2);

		nullMember.showMember();
		miura.showMember();

	}

}
