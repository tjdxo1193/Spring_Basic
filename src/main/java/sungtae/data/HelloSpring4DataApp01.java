package sungtae.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sungtae.data.service.MemberService;

public class HelloSpring4DataApp01 {
    // 스프링4 data를 이용한 프로젝트
    // 기존 JDBC API 이용시 문제점
    // JDBC 데이터베이스에 접근하기 위한 자바 표준 API
    // 하지만, JDBC 표준 API를 사용하면서 발생하는 문제는
    // 1) Connection/PreparedStatement/ResultSet 객체관리
    // 2) 복잡한 예외/SQLException 처리문제 - 원인 파악 모호
    // 3) DriverManger/JNDI를 이용한 Connection 객체 취득 문제

    // 하지만, 스프링 프레임워크의 JDBC 기능을 이용하면
    // 위 문제 대부분의 해결

    //persistence API
    // JDBC : 자바 표준 API
    // Hibernate : ORM 기반 persistence API
    // JPA  :  J2EE 죠준 API, hibernate를 기반으로 제작
    // myBatis : SQL Mapping 기반 persistence  API

    // 필요 라이브러리
    // Spring-jdbc

    // 회원 정보를 다루는 프로그램
    // App01 -> MemberService -> MemberDAO
    //             (MemberVO)
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4data01.xml");
        MemberService msrv = (MemberService) ctx.getBean("msrv");

        //회원정보 생성
        System.out.println(msrv.newMember() );

        System.out.println(msrv.modifyMember() );

        System.out.println(msrv.removeMember() );
    }
}
