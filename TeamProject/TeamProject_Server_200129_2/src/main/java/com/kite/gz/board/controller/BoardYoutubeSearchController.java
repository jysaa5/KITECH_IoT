package com.kite.gz.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.gz.board.domain.BoardYoutubeTitle;
import com.kite.gz.board.service.BoardYoutubeSearchService;


//BoardYoutubeSearchController: 유튜브 검색을 위한 컨트롤러
@Controller
@RequestMapping("/board/youtubeSearch")
public class BoardYoutubeSearchController {
	
	//객체 주입
	@Autowired
	BoardYoutubeSearchService youtubeSearchService;
	
	//youtubeSearchForm 메서드: 유튜브 검색을 하는 폼을 가져오는 메서드
	@RequestMapping(method = RequestMethod.GET)
	public String youtubeSearchForm() {
		
		return "board/youtubeSearchForm";
		
	}//youtubeSearchForm 메서드 끝
	

	    //youtubeSearch 메서드: 유튜브 검색어를 보내주는 메서드
		//커맨드형식 
		@RequestMapping(method = RequestMethod.POST)
		public String youtubeSearch(BoardYoutubeTitle request) {
			
			System.out.println(request);
			System.out.println("요청 idx: " + request.getIdx() );
			
			int result = youtubeSearchService.boardYoutubeSearchSave(request);
			
			System.out.println("결과: " + result );
			System.out.println("결과 idx: " + request.getIdx());
			
			
			return "board/youtubeSearch";
			
		}//youtubeSearch 메서드 끝
	
}//BoardYoutubeSearchController 클래스 끝
