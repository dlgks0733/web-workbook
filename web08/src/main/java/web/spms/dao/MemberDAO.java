package web.spms.dao;

import java.util.HashMap;
import java.util.List;

import web.spms.vo.Member;

public interface MemberDAO {
	List<Member> selectList(HashMap<String, Object> paramMap) throws Exception;
	void insert(Member member) throws Exception;
}
