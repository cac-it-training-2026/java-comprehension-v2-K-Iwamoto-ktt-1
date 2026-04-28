package q01_basic.question05;

public class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {
		this.setId(0);
		this.setPassword(null);
		this.name = null;
		this.age = 0;
		this.rank = 0;
	}

	public Member(int id, String password, String name, int age, int rank) {
		this.setId(id);
		this.setPassword(password);
		this.setName(name);
		this.setAge(age);
		this.setRank(rank);
	}

	public void buyItem() {
		System.out.println(this.name + " purchased the item at 50% off");
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}
