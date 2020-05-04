package com.care.member_service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class MemberPriService implements MemberService{

	@Override
	public void execute(Model model) {
		Map<String, Object> map= model.asMap();
		HttpServletRequest request=
				(HttpServletRequest) map.get("request");
		String id=request.getParameter("id");
		MemberDAO dao =new MemberDAO();
		MemberDTO mem = dao.privacy(id);
		model.addAttribute("pri",mem);
	}

}
