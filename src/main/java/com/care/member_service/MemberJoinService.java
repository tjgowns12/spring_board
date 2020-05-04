package com.care.member_service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;

public class MemberJoinService implements MemberService{

	@Override
	public void execute(Model model) {
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=
				(HttpServletRequest)map.get("request");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		MemberDAO dao=new MemberDAO();
		boolean flag=dao.join(id,pw);
		System.out.println(flag);
		model.addAttribute("flag",flag);
		
		
	}

}
