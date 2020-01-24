package memebr;

public class ChangePasswordService {
	
	//private MemberDao memberDao = new MemberDao();
	
	private MemberDao memberDao;
	
	public ChangePasswordService(MemberDao dao) {
		memberDao = dao;
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
