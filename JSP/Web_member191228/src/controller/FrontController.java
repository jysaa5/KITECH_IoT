package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteMemberServiceImpl;
import service.EditFormMemberService;
import service.EditMemberServiceImpl;
import service.IndexMemberServiceImpl;
import service.ListMemberServiceImpl;
import service.MemberService;
import service.RegFormMemberServiceImpl;
import service.RegMemberServiceImpl;

//서블릿 사용을 위해 HttpServlet 상속
public class FrontController extends HttpServlet { 

	//HashMap 인스턴스 생성: key: String / Value: MemberService 객체
	private Map<String, MemberService> uriMap = new HashMap<String, MemberService>();
	
	
	// 1. 초기화: Service 객체들을 관리 -> init() 오버라이딩
	@Override
	public void init() throws ServletException {
		
		//HashMap에 Key, Value값을 입력함.
		
		//요청, 첫 화면
		uriMap.put("/", new IndexMemberServiceImpl());
		
		// /index, 첫 화면
		uriMap.put("/index", new IndexMemberServiceImpl());
		
		// /member/regForm
		// 회원 가입 페이지
		uriMap.put("/member/regForm", new RegFormMemberServiceImpl());
		
		//회원 가입 완료 페이지
		uriMap.put("/member/reg", new RegMemberServiceImpl());
		
		//회원 리스트
		uriMap.put("/member/list", new ListMemberServiceImpl());
		
		//회원 정보 수정
		uriMap.put("/member/editForm", new EditFormMemberService());
		uriMap.put("/member/edit", new EditMemberServiceImpl());
		
		
		//회원 정보 삭제
		uriMap.put("/member/delete", new DeleteMemberServiceImpl());
		
		//기능확장: Service 구현 클래스 생성, view(JSP) 생성 
		
	}//init 메서드 끝

	// 2. 모든 요청 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}//doGet 메서드 끝

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}//doPost 메서드 끝

	// 모든 요청을 받았을때, 요청 분석
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 요청 분석
		String uri = request.getRequestURI(); // /op/member/list
		String conPath = request.getContextPath(); // /op
		// 배포될때, ContextPath가 이름이 바뀐다.

		// uri의 인덱스가 0번에서 시작하는 지.
		if (uri.indexOf(conPath) == 0) {
			
			//중복되는 ContextPath를 제외하고 uri을 저장한다.
			uri = uri.substring(conPath.length());
		}

		System.out.println("사용자 요청 URI:" + uri);

		// 요구사항에 대한 처리
		// 핵심 처리, 결과 데이터를 request 속성에 저장
		// view 페이지 지정

		MemberService ms = null;
		
		//각 uri에 맞는 값인 맵 객체를 ms 객체에 저장한다.
		ms = uriMap.get(uri);

		/*
		 * if (uri.equals("/index") || uri.equals("/")) { ms = new
		 * IndexMemberServiceImpl(); // 다형성 -> IndexMemberServiceImpl은 MemberService에
		 * 상속되어 있음. }else if(uri.equals("/member/regForm")) { ms = new
		 * RegFormMemberServiceImpl(); }
		 */

		//ms 객체가 null일 때. request에 맞는 서비스가 없을 경우.
		String viewPage = "/WEB-INF/views/invalid.jsp"; 
			
		//ms 객체에 맵 객체가 저장될 때.
		if(ms != null) {
				viewPage = ms.process(request);
		}
		
		// 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}//process 메서드 끝

}//FrontController 클래스 끝
