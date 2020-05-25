package web.spms.dao;

import java.util.HashMap;
import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import web.spms.vo.Member;

@Component("memberDAO")
public class MySqlMemberDAO implements MemberDAO {

	SqlSessionFactory sqlSessionFactory;

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public List<Member> selectList(HashMap<String, Object> paramMap) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			return sqlSession.selectList("spms.dao.MemberDAO.selectList", paramMap);
		} finally {
			sqlSession.close();
		}
	}

	public void insert(Member member) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		try {
			sqlSession.insert("spms.dao.MemberDAO.insert", member);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

	}

}
