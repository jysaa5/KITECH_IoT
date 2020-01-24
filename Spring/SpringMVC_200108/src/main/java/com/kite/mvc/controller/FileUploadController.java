package com.kite.mvc.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.kite.mvc.domain.Report;

@Controller
public class FileUploadController {

	// 받는 처리 방식 3가지 있음.

	@RequestMapping("/fileUpload/form")
	public String form() {

		return "fileUpload/form";
	}
	
	//첫번째 방법
	// post방식 외에는 잘못된 처리방식이므로.
	@RequestMapping(value = "/fileUpload/submit1", method = RequestMethod.POST)
	public String submit1(@RequestParam("sno") String sno, @RequestParam("report") MultipartFile reportFile,
			Model model, HttpServletRequest request) {

		
		String dir = "/uploadFile";
		String path = request.getSession().getServletContext().getRealPath(dir); //절대경로
		System.out.println(path);
		
		System.out.println("학번: " + sno);
		System.out.println("리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		model.addAttribute("report", "리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		if(!reportFile.isEmpty()) {
			
			File file = new File(path, sno+"_"+reportFile.getOriginalFilename()); //이 경로에 이미 파일이 있으면 덮어쓰기함. 
			try {
				reportFile.transferTo(file);
			} catch (Exception e) {
			System.out.println();
			}
			
			
		}
		
		
		
		return "fileUpload/upload";
	}
	
	//두번째 방법
	// post방식 외에는 잘못된 처리방식이므로.
	@RequestMapping(value = "/fileUpload/submit2", method = RequestMethod.POST)
	public String submit2(MultipartHttpServletRequest request, Model model) {

		String sno = request.getParameter("sno");
		MultipartFile reportFile = request.getFile("report"); // MultipartFile 객체로 변환시켜줌.

		System.out.println("학번: " + sno);
		System.out.println("리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		model.addAttribute("report", "리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		return "fileUpload/upload";
	}

	//세번째 방법
	// post방식 외에는 잘못된 처리방식이므로.
	@RequestMapping(value = "/fileUpload/submit3", method = RequestMethod.POST)
	public String submit3(Report report, Model model) {

		String sno = report.getSno();
		MultipartFile reportFile = report.getReport();

		System.out.println("학번: " + sno);
		System.out.println("리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		model.addAttribute("report", "리포트: " + reportFile.getOriginalFilename() + "(" + reportFile.getSize() + ")");

		return "fileUpload/upload";
	}

}
