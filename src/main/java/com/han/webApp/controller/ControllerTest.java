package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //컨트롤러 어노테이션
public class ControllerTest {
	//폼으로 접속, post로 접속
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name,
			               @RequestParam("num") int num, 
			               @RequestParam("tel") String tel, 
			               Model model){		
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel", tel);
		return "formView";
	}
/*	//폼으로 접속, post로 접속
	@RequestMapping("/formData")
	public String formData(HttpServletRequest req, Model model){
		String name=req.getParameter("name");
		String num=req.getParameter("num");
		String tel=req.getParameter("tel");
		
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel", tel);
		return "formView";
	}*/
	//A태그로 접속
	@RequestMapping(value="/aLink", method=RequestMethod.GET)
	public String aLinkTest(HttpServletRequest req, Model model){	
		//클라이언트 측에서 보낸 데이터를 읽어옴(req를 통해서)
		String num = req.getParameter("num");
		String name=req.getParameter("name");
		
		//뷰로 데이터 보내기
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		return "aLink";
	}
	
	
   @RequestMapping("/view1")
   public String viewTest(Model model){
	   //이름, 연락처 
	   model.addAttribute("name","박대식");
	   model.addAttribute("tel","010-3535-7356");
	   return "view1";
   }
}
