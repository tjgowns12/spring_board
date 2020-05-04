package com.care.member_dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.care.member_dto.MemberDTO;
import com.care.template.Constant;

public class MemberDAO {
	private JdbcTemplate template;
	public MemberDAO() {
		this.template=Constant.template;
	}
	public MemberDTO loginChk(String id,String pw) {
		String sql="select * from member02 where id='"+id+"'";
		//MemberDTO mem=null;
		try {
		MemberDTO mem=template.queryForObject(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		if(mem.getId().equals(id)&&mem.getPw().equals(pw)) {
		return mem;	
		}else {
			return null;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ArrayList<MemberDTO> list(){
		String sql="select * from member02";
		ArrayList<MemberDTO> list=(ArrayList<MemberDTO>)template.query(sql,new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		return list;
	}
	
	public MemberDTO privacy(String id) {
		String sql="select * from member02 where id='"+id+"'";		
		return template.queryForObject(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
	
	}
	
	
	public boolean join(final String id,final String pw) {
		String sql="insert into member02(id,pw) values(?,?)";
		try {
		template.update(sql,new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
			ps.setString(1, id);	
			ps.setString(2, pw);	
			}
			
		});return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
	
}
