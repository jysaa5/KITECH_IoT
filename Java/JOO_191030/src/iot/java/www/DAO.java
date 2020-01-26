package iot.java.www;
/*
 * 완성되지 않은 메서드들의 선언
 * 의도: 필요한 메서드들이 무엇이 있다. 
 * 인터페이싱: 서로 다른 걸 연결해주는 것.           
 */
public interface DAO {//Data Access Object : 데이터 읽고 쓰기 
	//CRUD (Create(새로운 데이터를 저장하고 추가하고 등록하는 것.) Read(현제 데이터를 읽어오는 것) Update(데이터 수정) Delete(필요없는거 삭제)
	// SQL :데이터베이스에 명령하는 형식
	
	public Object insert (Object arg);
	//insert : 데이터 추가 
	//int, voide를 많이 사용.
	//선언만 한 메서드: 추상 메서드 -> {}가 없다. 
	public Object selectAll(); //데이터 다 내놔라.
	public Object select (Object condition);
	//데이터를 가져옴 = read / condition = 조건, 조건에 해당하는 것을 반환하겠다. 반환값을 처리 해야한다. = 검색하기 개념.
	public Object update(Object arg);//데이터 수정
	public Object delete (int id);
	//데이터 삭제
	public int isEmpty();
	public Space selectByCarNumber(String number);
	
	
}//DAO인터페이스 끝
