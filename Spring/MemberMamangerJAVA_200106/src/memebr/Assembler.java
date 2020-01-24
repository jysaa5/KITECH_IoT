package memebr;

public class Assembler {
	
	// 보관 객체
	private MemberDao memberDao;
	private MemberRegisterService registService;
	private ChangePasswordService pwService;
	
	
	public Assembler() {
		// 객체 생성, 주입
		memberDao = new MemberDao();
		registService = new MemberRegisterService(memberDao);
		pwService = new ChangePasswordService(memberDao);
	}

//인스턴스 제공
	
	public MemberDao getMemberDao() {
		return memberDao;
	}


	public MemberRegisterService getRegistService() {
		return registService;
	}


	public ChangePasswordService getPwService() {
		return pwService;
	}
	
	

	
	
	
	
	
	
	
	
}
