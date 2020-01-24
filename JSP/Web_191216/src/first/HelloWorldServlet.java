package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/Hello") //경로 요청
public class HelloWorldServlet extends HttpServlet {

	//서블릿 클래스의 작성 규칙
	//반드시 HttpServlet을 상송해야한다. -> Tomcat에서 실행 가능하다. 
	
	//사용형식
	//1. 사용자의 요청에 따른 웹문서(일반 텍스트도 가능) 형식으로 응답하는 경우.
	//2. 초기화 처리하는 경우
	//3. Front Controller 역할 -> MVC 패턴
	

	protected void doGet(HttpServletRequest request, //사용자의 요청 정보를 담은 객체이다.
			HttpServletResponse response //사용자에게 응답할 데이터를 담은 객체이다.
			) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter(); //응답을 text로 쓴다.
		
		out.println("<html><head><title>Servlet Page</title></head>");
		out.println("<body>");
		out.println("현재 날짜와 시간은: "+ new Date());
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
