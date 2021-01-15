package sungtae.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 파일명 : SungJukV11Main
 * 작성일 : 2020.1.15
 *
 * 프로그램 설명 : 성적처리프로그램 v11
 * 스프링 기반 성적처리 프로그램 작성
 * 인터페이스를 기반으로 리디자인함
 *
 */
public class SungJukV11Main {
    public static void main(String[] args) {
//        SungJukV11Service sjsrv =
//                        new SungJukV11ServiceImpl();

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("sungjuk.xml");
        SungJukV11Service sjsrv = (SungJukV11ServiceImpl)ctx.getBean("sjsrv");

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) { // 메뉴 띄우고 작업번호 입력을 반복
            ((SungJukV11ServiceImpl)sjsrv).displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.readSungJuk(); break;
                case "3": sjsrv.readOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력!!");
            }
        }
    }
}
