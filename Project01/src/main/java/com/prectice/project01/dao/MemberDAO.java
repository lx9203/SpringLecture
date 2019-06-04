package com.prectice.project01.dao;

import java.util.List;

import com.prectice.project01.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList();
	public void insertMember(MemberDTO vo);
	public MemberDTO viewMember(String userid);
	public void deleteMember(String userid);
	public void updateMember(MemberDTO vo);
}
