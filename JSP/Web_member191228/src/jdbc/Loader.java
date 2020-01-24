package jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//HttpServlet 상속
//드라이버 로더 서블릿
public class Loader extends HttpServlet {
	
	//init(ServletConfig config) 메서드 
	//ServletConfig: 인터페이스
	public void init(ServletConfig config) throws ServletException {
		
		//.getInitParameter: "jdbcDriver"의 이름을 가진 파라미터 값을 web.xml에서 가져온다. 
		String jdbcDriver = config.getInitParameter("jdbcDriver");

		try {
			/* 데이터베이스 드라이버 로드 */
			Class.forName(jdbcDriver);
			System.out.println("데이터베이스 드라이버 로드 성공!");
		} catch (ClassNotFoundException cne) {
			System.out.println("데이터베이스 드라이버 로드 실패!");
			cne.printStackTrace(); // 문제가 생기면 콘솔에 문제를 출력해줌.
		}
	}

}
