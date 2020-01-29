package com.kite.gz.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.gz.board.domain.BoardWriteRequest;
import com.kite.gz.board.domain.BoardYoutubeTitle;
import com.kite.gz.board.service.BoardWriteService;
import com.kite.gz.board.service.BoardYoutubeSearchService;


//BoardYoutubeSearchController: 방명록 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러 클래스 
@Controller
@RequestMapping("/board/youtubeSearch")
public class BoardYoutubeSearchController {
	
	@Autowired
	BoardYoutubeSearchService saveService;
	
	//사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping(method = RequestMethod.GET)
	public String videoSearch() {
		
		return "board/youtubeSearchForm";
	}
	
	
	
	//write 메서드: 작성한 방명록을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
		//커맨드형식 
		@RequestMapping(method = RequestMethod.POST)
		public String videoTitleSave(BoardYoutubeTitle request) {
			
			System.out.println(request);
			System.out.println("요청 idx: " + request.getIdx() );
			
			int result = saveService.boardYoutubeSearchSave(request);
			
			System.out.println("결과: " + result );
			System.out.println("결과 idx: " + request.getIdx());
			
			
			return "board/youtubeSearch";
		}
	
	
}
