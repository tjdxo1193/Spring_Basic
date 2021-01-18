package sungtae.data.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sungtae.data.vo.MemberVO;
import java.util.List;


@Repository("mdao03")
public class MemberDAO03 {
    @Autowired
    private SqlSession sqlSession;
    // mybatis 사용하기 위해
    // SqlSession 객체를 MemberDAO03에 DI함

    public int insertMember(MemberVO mvo) {
        return sqlSession.insert("member.insertMember", mvo);
    }

    public int updateMember(MemberVO mvo) {
        return sqlSession.update("member.updateMember", mvo);
    }

    public int deleteMember(String name) {
        return sqlSession.delete("member.deleteMember", name);
    }

    public List<MemberVO> selectMember() {
        return sqlSession.selectList("member.selectList");
    }
    // select one 문을 실행시 jdbcTemplate.queryForObject 메서드를 이용함
    public MemberVO selectOneMember(String userid) {
        return sqlSession.selectOne("member.selectOne", userid);
    }

}
