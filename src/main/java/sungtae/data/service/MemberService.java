package sungtae.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sungtae.data.dao.MemberDAO;
import sungtae.data.vo.MemberVO;


@Service("msrv")
public class MemberService {

    @Autowired
    private MemberDAO mdao;

    // 회원 정보 생성
    public String newMember() {
        String result = "회원 정보 생성 실패!";

        MemberVO mvo = new MemberVO();
        mvo.setUserid("spring4");
        mvo.setPasswd("123456");
        mvo.setName("홍길동");
        mvo.setGrade("Gold");
        mvo.setPoints("1000");
        mvo.setRegdate("2021-01-18 10:55:00");

        if (mdao.insertMember(mvo) > 0)
            result = "회원 정보 생성 성공!";
        return result;
    }
        // 회원 정보 수정(이름, 등급, 포인트)
        public String modifyMember() {
            String result = "회원 정보 수정 실패!";
            MemberVO mvo = new MemberVO();
            mvo.setUserid("spring4");
            mvo.setName("일자매");
            mvo.setGrade("Bronze");
            mvo.setPoints("0");

            if (mdao.updateMember(mvo) > 0)
                result = "회원 정보 수정 성공!";
            return result;
        }
        // 회원정보삭제 (이름)
        public String removeMember() {
            return null;
        }
    }
