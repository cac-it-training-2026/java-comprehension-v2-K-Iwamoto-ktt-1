package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {

	private int id;
	private String password;
	private String name;
	private Date birthday;
	private int rank;
	private List<Coupon> coupons;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public Member() {

	}

	public Member(int id, String password, String name, Date birthday, int rank, List<Coupon> coupons) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;
		this.coupons = coupons;
	}

	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", rank="
				+ rank + ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(this.toString());
		System.out.println("******************");
	}

	public static Member getInstance(int id, String password, String name, String birthdayString)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy//MM//dd");
		sdf.setLenient(false);
		Date birthdayDate = sdf.parse(birthdayString);

		int setRank = (int) (Math.random() * 10) % 3 + 1;

		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");
		List<Coupon> coupons = new ArrayList<>();
		coupons.add(coupon1);
		coupons.add(coupon2);

		Member member = new Member(id, password, name, birthdayDate, setRank, coupons);
		return member;
	}

}
