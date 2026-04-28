package q01_basic.question03;

class Member {

	private String name;
	private int age;
	private int rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.name = null;
		this.age = 0;
		this.rank = 0;
	}

	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}

}
