package joo.iot.www;
import java.text.SimpleDateFormat;

//import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {


		java.util.Date today = new java.util.Date();

		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); //Date 객체를 받아서 변경할 것이다. 
		
		String todaystr = sdf.format(today);
		System.out.println(todaystr);
		

		
		
		
	}

}
