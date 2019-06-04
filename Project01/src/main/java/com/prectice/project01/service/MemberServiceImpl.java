package com.prectice.project01.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.prectice.project01.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO viewMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberDTO vo) {
		// TODO Auto-generated method stub

	}

}
