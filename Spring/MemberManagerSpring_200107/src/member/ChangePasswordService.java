package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value="changePasswordService") //여기서는 value값을 써줘야됨.MainForSpring에 있는 이름과 동일하게
@Service(value="changePasswordService")
public class ChangePasswordService {
	
	//private MemberDao memberDao = new MemberDao();
	@Autowired
	private MemberDao memberDao;
	
	//생성자
	/*
	 * public ChangePasswordService(MemberDao dao) { memberDao = dao; }
	 */
	
	//setter
	/*
	 * public void setMemberDao(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	

	public void changePassword(
			String email, 
			String oldPassword, 
			String newPassword) throws MemberNotfoundException, IdPasswordNotMatchingException {
		
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) {
			throw new MemberNotfoundException();
		}
		member.changePassword(oldPassword, newPassword);
		
		memberDao.update(member);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
