package com.care.member_service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class MemberLoginService implements MemberService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map= model.asMap();
		HttpServletRequest request=
				(HttpServletRequest) map.get("request");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		MemberDAO dao=new MemberDAO();
		System.out.println("id : "+id);
		MemberDTO mem=dao.loginChk(id, pw);
		HttpSession session = request.getSession();
		
		if(mem!=null) {
			session.setAttribute("id", mem.getId());
		}else if(mem==null) {
			session.setAttribute("id", null);
		}
	}

}
