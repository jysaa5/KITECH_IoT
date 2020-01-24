package member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component(value = "memberDao") //value를 정의 안하면, 자동으로 memberDao로 등록됨. 클래스 앞에 알파벳이 소문자가 된 상태로 등록됨.
@Repository(value="memberDao")
public class MemberDao {
	
	private static long nextId=0;
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	
	public  Collection<Member> selectAll() {
		return map.values();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}	
