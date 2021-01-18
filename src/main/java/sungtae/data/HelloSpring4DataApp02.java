package sungtae.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sungtae.data.service.MemberService;

public class HelloSpring4DataApp02 {
    // 스프링4 data를 이용한 프로젝트
    // database connection pool 을 이용함

    // 회원 정보를 다루는 프로그램
    // App01 -> MemberService -> MemberDAO
    //             (MemberVO)
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4data02.xml");
        MemberService msrv = (MemberService) ctx.getBean("msrv");

        //회원정보 생성
        System.out.println(msrv.newMember() );

        //회원정보 조회(아이디, 등급, 가입일)
        System.out.println(msrv.readMember() );

        //회원정보 상세 조회(아이디로 검색, 모든 컬럼 출력)
        System.out.println(msrv.readOneMember() );

//        //회원정보 수정
//        System.out.println(msrv.modifyMember() );
//        //회원정보 삭제
//        System.out.println(msrv.removeMember() );
    }
}
