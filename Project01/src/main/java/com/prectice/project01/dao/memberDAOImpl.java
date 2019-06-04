package com.prectice.project01.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.prectice.project01.dto.MemberDTO;

@Repository
public class memberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {

	}

	@Override
	public MemberDTO viewMember(String userid) {
		return null;
	}

	@Override
	public void deleteMember(String userid) {

	}

	@Override
	public void updateMember(MemberDTO vo) {

	}

}
