package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.MemberDAO;
import com.example.demo.service.MemberService;
import com.example.demo.vo.MemberVO;
import com.sun.tools.javac.util.List;

@Controller
public class MemberController {

	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private MemberService memberService;
	
	private Logger log = LoggerFactory.getLogger(MemberController.class);
	
	
	//특정아이디 검색
	@ResponseBody
	@GetMapping("/member/{id}")
	public MemberVO findId(@PathVariable String id) throws Exception{
		
		log.info(memberService.findId(id).toString());
		
		return memberService.findId(id);
	}
	
	//전체정보 검색
	@ResponseBody
	@GetMapping("/member")
	public List<MemberVO> findAll() throws Exception {
		List<MemberVO> allMember = memberService.allMember();
		
		log.info(memberService.allMember().toString());
		return allMember;
	}
	
	//post로 입력
	@ResponseBody
	@PostMapping("/member")
	public void addMember(@RequestBody MemberVO vo) throws Exception {
		memberService.addMember(vo);
	}
}
