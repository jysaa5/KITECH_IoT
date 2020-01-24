package member;

public class ChangePasswordService {
	
	//private MemberDao memberDao = new MemberDao();
	
	private MemberDao memberDao;
	
	//생성자
	/*
	 * public ChangePasswordService(MemberDao dao) { memberDao = dao; }
	 */
	
	//setter
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	
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
