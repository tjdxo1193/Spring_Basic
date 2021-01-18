package sungtae.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sungtae.data.vo.MemberVO;


@Repository("mdao")
public class MemberDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    // MemberDAO 에서 사용할 JdbcTemplate 객체를
    // DI에 받기 위해 @Autowired 로 선언

    public int insertMember(MemberVO mvo) {
        String sql = " insert into member values (?,?,?,?,?,?) ";

        //SQL문에 전달할 매개변수 값 선언
        Object[] params = new Object[]{
                mvo.getUserid(), mvo.getPasswd(), mvo.getName(),
                mvo.getGrade(), mvo.getPoints(), mvo.getRegdate()
        };

        // SQL문에 전달할 때 매개변수 값들의 유형 (생략)


        return jdbcTemplate.update(sql, params);
    }

    public int updateMember(MemberVO mvo) {
        String sql = " update member set name = ? , grade = ? , points = ? where userid = ? ";
        Object[] params = new Object[]{
               mvo.getName(), mvo.getGrade(), mvo.getPoints(), mvo.getUserid()
        };

        return jdbcTemplate.update(sql, params);
    }
}
