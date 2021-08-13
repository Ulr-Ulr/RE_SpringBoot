package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.MemberVO;
import com.sun.tools.javac.util.List;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	//특정아이디 검색
	public MemberVO findId(String id) {
		
		return memberDAO.fidId(id);
	}
	//전체정보
	public List<MemberVO> allMember() {
		
		return memberDAO.allMember();
	}
	//post 추가
	public void addMember(MemberVO vo) {
		memberDAO.addMember(vo);
		
	}

}
