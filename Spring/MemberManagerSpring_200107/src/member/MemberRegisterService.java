package member;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component (value="registService")
@Service (value="registService") //서비스임을 알려줌.
public class MemberRegisterService {

	private MemberDao memberDao;

	//setter 방식 
	@Autowired
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
