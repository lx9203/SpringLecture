package com.example.spring01.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.example.spring01.model.dto.MemberDTO;

@Repository
// 컨트롤러나 모델을 사용자가 직접 관리해도 되지만, 스프링에서는 의존성 주입 DI라고 하여 스프링에게 맡김
// @Repository 라는 어노테이션을 붙여주면 서버가 구동되며 자동으로 메모리에 올려줌
// 이렇게 올라간 객체들은 new 라고 생성하지 않아도  @Inject 라는 어노테이션을 붙여 객체를 삽일할 수 있음
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {
		sqlSession.insert("member.insertMember", vo);
	}

	@Override
	public MemberDTO viewMember(String userid) {
		return sqlSession.selectOne("member.viewMember", userid);
	}

	@Override
	public void deleteMember(String userid) {
		sqlSession.delete("member.deleteMember", userid);
	}

	@Override
	public void updateMember(MemberDTO vo) {
		sqlSession.update("member.updateMember", vo);
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		boolean result = false; 
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		int count = sqlSession.selectOne("member.checkPw", map);
		if(count == 1)
			result = true;
		return result;
	}

}
