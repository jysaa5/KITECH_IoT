package member;

import java.util.Date;

public class MemberRegisterService {

	private MemberDao memberDao;

	//setter 방식 
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	
	//생성자방식
	/*
	 * public MemberRegisterService(MemberDao memberDao) { super(); this.memberDao =
	 * memberDao; }
	 */


	/*
	 * public MemberRegisterService(MemberDao memberDao) { this.memberDao =
	 * memberDao; }
	 */

	public void regist(RegisterRequest request) throws AleadyExistingMemberException {

		Member member = memberDao.selectByEmail(request.getEmail());

		if (member != null) {
			throw new AleadyExistingMemberException();
		}

		Member newMember = new Member(request.getEmail(), request.getPassword(), request.getName(), new Date());

		memberDao.insert(newMember);

	}

}
