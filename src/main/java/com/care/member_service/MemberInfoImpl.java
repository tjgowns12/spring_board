package com.care.member_service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class MemberInfoImpl implements MemberService {

	@Override
	public void execute(Model model) {
		MemberDAO dao= new MemberDAO();
		ArrayList<MemberDTO> list = dao.list();
		 
		model.addAttribute("list",list);
		
	}

}
