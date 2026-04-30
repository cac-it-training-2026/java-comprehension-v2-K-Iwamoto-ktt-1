package q02_advanced.question03;

import java.util.List;

import q02_advanced.question02.Member;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		Member targetMember = null;
		for (Member member : members) {
			if (member.getId() == targetId) {
				targetMember = member;
				break;
			}
		}

		if (targetMember == null) {
			System.out.println("該当者はいませんでした。");
		} else {
			targetMember.setPassword(newPassword);
		}
	}

}
