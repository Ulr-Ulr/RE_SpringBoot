package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.MemberVO;
import com.sun.tools.javac.util.List;

@Mapper
public interface MemberDAO {
	//특정아이디 검색
	MemberVO fidId(String id);
	//전체정보
	List<MemberVO> allMember();
	//post 추가
	void addMember(MemberVO vo);

}
