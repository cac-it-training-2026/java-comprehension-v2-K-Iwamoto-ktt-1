package q03_extra;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public static void ShowCreateUser(List<Member> members, int targetId) {
		Member targetMember = new Member();

		for (Member member : members) {
			if (targetId == member.getId()) {
				targetMember = member;
				break;
			}
		}

		targetMember.showMember();
	}

}
