package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member_service.MemberInfoImpl;
import com.care.member_service.MemberJoinService;
import com.care.member_service.MemberLoginService;
import com.care.member_service.MemberPriService;
import com.care.member_service.MemberService;
import com.care.template.Constant;

@Controller
public class MemberController {
	private MemberService memSer;
	public MemberController() {
		String config="classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		JdbcTemplate template=ctx.getBean("template",JdbcTemplate.class);
		Constant.template=template;
	}
	
	@RequestMapping("index")
	public String test() {		
		return "member/index";
	}
	
	@RequestMapping("login")
	public String login(HttpSession session) {
		
		return "member/login";
	}
	
	@RequestMapping("logChk")
	public String LoginChk(HttpServletRequest request,Model model,HttpSession session) {
		model.addAttribute("request",request);
		memSer=new MemberLoginService();
		memSer.execute(model);
		System.out.println("model============"+model);
		if(session.getAttribute("id")!=null) {
			return "member/successLogin";
		}else {
			return "member/login";
		}
	
	}
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		return "member/index"; 
			
	}
	
	@RequestMapping("memberInfo")
	public String memberInfo(Model model,HttpSession session) {
		memSer= new MemberInfoImpl();
		memSer.execute(model);

		return "member/memberInfo";
	}
	@RequestMapping("privacy")
	public String privacy(HttpServletRequest request,Model model) {
	
	model.addAttribute("request",request);
	memSer = new MemberPriService();
	memSer.execute(model);
	return "member/privacy";
	}
	
	@RequestMapping("back")
	public String back() {
		
		return "redirect:memberInfo";
	}
	@RequestMapping("join")
	public String join(HttpServletRequest request,Model model) {
		memSer=new MemberJoinService();
		model.addAttribute("request",request);
		memSer.execute(model);
		return "member/joinChk";
	}
	
	@RequestMapping("modiJoin")
	public String modiJoin() {
		return "member/join";
	}

	
}
